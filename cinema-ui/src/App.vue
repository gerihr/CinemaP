<template>
  <div id="app">
    <div id="nav">
    <div class="masthead mb-auto">
      <div class="inner">
        <h3 id="logo" class="masthead-brand"><router-link to="/">Cinema World</router-link></h3>
        <nav class="nav nav-masthead justify-content-center">
          <a class="nav-link active"> <router-link to="/">Home</router-link></a> |
          <a class="nav-link"> <router-link to="/about">Movie</router-link></a> |
          <a class="nav-link"> <router-link to="/cinema">Program</router-link></a> |
          <a class="nav-link"> <router-link to="/tickets">Tickets</router-link></a>
        </nav>
      </div>
    </div>
    </div>
    <router-view/>
  </div>
</template>

<style>
#app {
  font-family: Georgia;
  -webkit-font-smoothing: initial;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
}
.masthead-brand {
  float: left;
}

#logo {
  color:#cc0a0a;
  font-family: Georgia;
  font-size: 35px ;
}

#nav {
  padding: 30px;
  background-color: black;;
}

#nav a {
  font-weight: bold;
  color: #ab0b00;
}

#nav a.router-link-exact-active {
  color: white;
}
</style>
