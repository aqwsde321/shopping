<script>
import Footer from './components/Footer.vue';
import Header from './components/Header.vue';
import Home from './pages/Home.vue';


export default {
  name: 'App',
  components: {
    Header,
    Home,
    Footer,
  }
}



</script>

<template>

  <Header />

  <Home />

  <Footer />

</template>
