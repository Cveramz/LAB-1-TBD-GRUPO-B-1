<script setup>

import TopBar from '../components/TopBar.vue';
import SideBar from "../components/SideBar.vue";
import axios from 'axios';
</script>

<script>
export default {
  data() {
    return {
      titulo: '',
      tipo: '',
      ubicacion: '',
      descripcion: '',
      equipamiento_necesario: '',
    };
  },
  methods: {
    async submitForm() {
      /*
      try {
        const response = await axios.post('/emergencia', {
          id: null, // Puedes enviar null o dejar este campo en blanco si el backend lo maneja automáticamente
          idInstitucion: null, // Puedes enviar null o dejar este campo en blanco si el backend lo maneja automáticamente
          tipo: this.tipo,
          ubicacion: this.ubicacion,
          equipamiento_necesario: this.equipamiento_necesario,
          titulo: this.titulo,
          descripcion: this.descripcion,
        });

        // Aquí puedes manejar la respuesta del servidor si es necesario
        console.log('Respuesta del servidor:', response.data);
      } catch (error) {
        console.error('Error al enviar el formulario:', error);
      }*/
    }
  }
}
</script>


<template>
  <div>
    <TopBar />
    <SideBar />
    <div class="view">
      <div class="content">
        <h1>Crear Emergencia</h1>
        <p>A continuación rellene la siguiente información</p>
        <div class="form-container">

          <div class="card" style="margin-top: 20px;">
            <form @submit.prevent="submitForm">
              <label for="nombre-emergencia">Nombre de Emergencia:</label>
              <input type="text" id="nombre-emergencia" v-model="titulo" required>

              <label for="tipo-emergencia">Tipo de emergencia:</label>
              <input type="text" id="tipo-emergencia" v-model="tipo" required>

              <label for="ubicacion">Ubicación:</label>
              <input type="text" id="ubicacion" v-model="ubicacion" required>


              <label for="descripcion">Descripción y requisitos:</label>
              <textarea id="descripcion" v-model="descripcion"
                placeholder="Detalle su emergencia e ingrese una lista de requisitos"></textarea>

              <label for="equipamiento">Equipamiento necesario:</label>
              <textarea id="equipamiento" v-model="equipamiento_necesario"
                placeholder="Detalle el equipamiento necesario"></textarea>

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

input,
textarea,
select,
button {
  margin-bottom: 10px;
}</style>