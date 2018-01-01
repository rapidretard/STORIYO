<template>
  <div>
    <b-container>
      <b-form>
        <b-row align-h="center">
          <b-form-group id="emailInputGroup"
                        label="Email Address:"
                        label-for="emailInput"
                        description="We take privacy seriously and this email will never be shared">
            <b-form-input id="emailInput"
                          v-model="email"
                          type="email"
                          placeholder="Enter your primary email id"
                          required></b-form-input>
          </b-form-group>
        </b-row>
        <b-row align-h="center">
          <b-form-group id="usernameInputGroup"
                        label="Username:"
                        label-for="usernmInput">
            <b-form-input id="usernmInput"
                          v-model="username"
                          type="text"
                          placeholder="Enter a zazzy username"></b-form-input>
          </b-form-group>
        </b-row>
        <b-row align-h="center">
          <b-form-group id="passwordInputGroup"
                        label="Password:"
                        label-for="pwdInput">
            <b-form-input id="pwdInput"
                          v-model="password"
                          type="password"></b-form-input>
          </b-form-group>
        </b-row>
        <b-button variant="primary" v-on:click="submitLogin()">Login</b-button>
      </b-form>
    </b-container>
  </div>
</template>

<script>
  import axios from 'axios'

  export default {
    name: 'login',
    data() {
      return {
        username: '',
        password: '',
        email: ''
      }
    },

    methods: {
      submitLogin() {
        axios.post('http://localhost:8080/user/signUp', {
          userName: this.username,
          email: this.email,
          password: this.password
        })
          .then(function (response) {
            console.log(response)
          })
          .then(function (error) {
            console.log(error)
          })
      }
    }
  }
</script>
