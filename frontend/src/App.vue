<script>
import Footer from '@/components/Footer.vue';
import Header from '@/components/Header.vue';
import store from '@/scripts/store';


export default {
  name: 'App',
  components: {
    Header,

    Footer,
  },
  setup() {
    const id = sessionStorage.getItem("id");
    if (id) {
      store.commit("setAccount", id);
    }
  }
}



</script>

<template>

  <Header />

  <RouterView />

  <Footer />

</template>
