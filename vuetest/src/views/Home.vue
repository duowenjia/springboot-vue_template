<template>
  <div class="home">
    <table border="1">
        <th>测试table</th>
        <tr><td>11</td><td>12</td></tr>
        <tr><td>21</td><td>22</td></tr>
    </table>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'Home',
  components: {
    HelloWorld
  }
}
</script>
