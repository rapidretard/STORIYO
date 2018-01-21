<template>
  <div>
    <b-navbar toggleable="md" type="light" variant="light">

      <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>

      <b-navbar-brand to="home">STORIYO</b-navbar-brand>

      <b-navbar-nav>
        <b-nav-item to="login">Start a new story</b-nav-item>
      </b-navbar-nav>

      <b-collapse is-nav id="nav_collapse">
        <!-- Right aligned nav items -->
        <b-navbar-nav class="ml-auto">
          <b-navbar-nav>
            <b-nav-item to="login">Login</b-nav-item>
          </b-navbar-nav>
          <b-nav-item-dropdown right>
            <!-- Using button-content slot -->
            <template slot="button-content">
              <em>User</em>
            </template>
            <b-dropdown-item href="#">Profile</b-dropdown-item>
            <b-dropdown-item href="#">Signout</b-dropdown-item>
          </b-nav-item-dropdown>
        </b-navbar-nav>
      </b-collapse>
    </b-navbar>
  </div>
</template>

<script>
  export default {
    name: 'navbar'
  }
</script>

<style scoped>

</style>
