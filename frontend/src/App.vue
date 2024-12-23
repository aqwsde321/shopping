<script>
import Footer from '@/components/Footer.vue';
import Header from '@/components/Header.vue';
import store from '@/scripts/store';
import axios from 'axios';
import { watch } from 'vue';
import { useRoute } from 'vue-router';


export default {
  name: 'App',
  components: {
    Header,

    Footer,
  },
  setup() {
    const check = () => {
      axios.get("/api/account/check").then(({ data }) => {
        console.log("check", data);
        store.commit("setAccount", data || 0);
      })
    }

    const route = useRoute();

    watch(route, () => {
      check();
    })
  }
}



</script>

<template>

  <Header />

  <RouterView />

  <Footer />

</template>
