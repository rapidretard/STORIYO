<template>
  <div>
    <navbar></navbar>
    <homeContent></homeContent>
  </div>
</template>

<script>
  import Navbar from './navbar'
  import HomeContent from './homeContent'

  export default {
    components: {
      HomeContent,
      Navbar
    },
    name: 'home'
  }
</script>

<style scoped>

</style>
