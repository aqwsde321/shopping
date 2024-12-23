import { createApp } from 'vue'
import '@/style.css'
import App from '@/App.vue'
import store from '@/scripts/store'
import router from '@/scripts/router'

createApp(App).use(store).use(router).mount('#app')
