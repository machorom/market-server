<template>
  <div class="menu">
    <ul>
      <li v-for="menu in menus" :key="menu">
        {{ menu }}
      </li>
    </ul>
    {{info}}
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "LIst",
  data() {
    return {
      menus: ["Home", "products", "About"],
      info: null,
    };
  },
  created: function() {
    console.log("created")
    this.fetchData()
  },
  methods:{
    async fetchData(){
      axios.get('http://localhost:8080/api/product/all')
          .then(response => {
            console.log(response)
            this.info = response
          })
    },
  },
  components: {},
}
</script>

<style scoped>

</style>