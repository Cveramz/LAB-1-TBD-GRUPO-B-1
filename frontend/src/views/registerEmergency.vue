<script setup>

import { ref } from 'vue'
import TopBar from '../components/TopBar.vue';
import SideBar from "../components/SideBar.vue";
</script>
<script>

export default {
  data() {
    return {
      nombreEmergencia: '',
      descripcion: '',
      estado: 'no completado'
    };
  },
  methods: {
    submitForm() {
      // Enviar formulario
      console.log('Nombre de Emergencia:', this.nombreEmergencia);
      console.log('Descripción:', this.descripcion);
      console.log('Estado:', this.estado);
    }
  }
}
</script>


<template>
    <div>
      <TopBar/>
      <SideBar />
      <div class="view">
        <div class="content">
          <h1>Crear Emergencia</h1>
          <p>A continuación rellene la siguiente información</p>
          <div class="form-container">
            
            <div class="card" style="margin-top: 20px;">
              <form @submit.prevent="submitForm">
                <label for="nombre-emergencia">Nombre de Emergencia:</label>
                <input type="text" id="nombre-emergencia" v-model="nombreEmergencia" required>
    
                <label for="descripcion">Descripción y requisitos:</label>
                <textarea id="descripcion" v-model="descripcion" placeholder="Detalle su emergencia e ingrese una lista de requisitos"></textarea>
    
                <label for="estado">Estado:</label>
                <select id="estado" v-model="estado">
                  <option value="completado">Completado</option>
                  <option value="no completado">No Completado</option>
                </select>
    
                <button type="submit">Registrar Emergencia</button>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </template>

<style scoped>
.view {
  box-sizing: border-box;
  display: flex;
  justify-content: center;
  margin-left: 70px;
  padding-top: 110px;
}

.content {
  display: flex;
  justify-content: center;
  box-sizing: border-box;
  flex-direction: column;
  padding: 10px;
  width: 100%;
  margin: auto !important;
  max-width: 1200px;
}


.card {
  display: flex;
  margin: auto;
  flex-direction: column;
  max-width: 800px;
  box-sizing: border-box;
  background-color: #ffffff;
  width: 100%;
  padding: 20px;
  border-radius: 8px;
}

h1 {
  font-weight: 700;
  font-size: 24px;
  color: #0288D1;
}

h2 {
  font-weight: 500;
  font-size: 20px;
}

.form-container {
  margin-top: 20px;
}

form {
  display: flex;
  flex-direction: column;
  max-width: 300px;
}

input, textarea, select, button {
  margin-bottom: 10px;
}
</style>