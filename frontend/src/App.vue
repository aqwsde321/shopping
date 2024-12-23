<script>
import Footer from './components/Footer.vue';
import Header from './components/Header.vue';


export default {
  name: 'App',
  components: {
    Header,

    Footer,
  }
}



</script>

<template>

  <Header />

  <RouterView />

  <Footer />

</template>
