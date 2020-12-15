<template>
    <div>
        <el-table
                :data="tableData"
                border
                style="width: 100%">
            <el-table-column
                    fixed
                    prop="biaoti"
                    label="标题"
                    width="150">
            </el-table-column>
            <el-table-column
                    prop="neirong"
                    label="内容"
                    width="120">
            </el-table-column>
            <el-table-column
                    prop="name"
                    label="姓名"
                    width="120">
            </el-table-column>

            <el-table-column

                    label="操作"
                    width="100">
                <template slot-scope="scope">
                    <el-button @click="handleClick(scope.row)" type="text" size="small">查看</el-button>
                    <el-button type="text" size="small">编辑</el-button>
                </template>
            </el-table-column>
        </el-table>
        <div class="block">
            <el-pagination
                    @size-change="handleSizeChange"
                    @current-change="handleCurrentChange"
                    :current-page="currentPage"
                    :page-sizes="[1,2,3,4,5]"
                    :page-size="pageSize"
                    layout="total, sizes, prev, pager, next, jumper"
                    :total="total">
            </el-pagination>
        </div>
    </div>

</template>

<script>
    export default {
        methods: {
            handleClick(row) {
                alert(row.name)
            },

            handleCurrentChange(currentPage1){
                const _this=this;
                this.currentPage=currentPage1;
                axios.get("http://localhost:8081/Boke/findByPage/"+this.currentPage+"/"+this.pageSize).then(function (resp) {
                    _this.total=resp.data.totalElements;
                    _this.tableData=resp.data.content;
                })
            },
            handleSizeChange(changePage){
                const _this=this;
                this.pageSize=changePage;
                this.currentPage=1;
                axios.get("http://localhost:8081/Boke/findByPage/1/"+this.pageSize).then(function (resp) {
                    _this.total=resp.data.totalElements;
                    _this.tableData=resp.data.content;
                })
            }
        },created() {
            const _this=this;
            axios.get("http://localhost:8081/Boke/findByPage/1/1").then(function (resp) {
                _this.total=resp.data.totalElements;
                _this.tableData=resp.data.content;

            })
        },

        data() {
            return {
                total:null,
                tableData:null,
                pageSize:1
            }
        }
    }
</script>
