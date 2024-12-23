import { defineConfig } from 'vite';
import vue from '@vitejs/plugin-vue';

export default defineConfig({
  plugins: [vue()],
  resolve: {
    alias: {
      '@': '/src', // @를 src 디렉토리로 설정
    }
  },
  server: {
    proxy: {
      '/api': {
        target: 'http://192.168.0.66:8080', // Spring Boot 서버 주소
        changeOrigin: true,
        secure: false,
        ws: true
      },
    },
  },
});
