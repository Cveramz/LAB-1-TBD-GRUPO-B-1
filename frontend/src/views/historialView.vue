<script setup>
import TopBar from '../components/TopBar.vue';
import SideBar from "../components/SideBar.vue"
</script>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      tipo: "",
      descripcion: ""
    }
  },
}
</script>


<template>
  <TopBar/>
  <SideBar />
  <div class="view">
    <div class="content">
      <h1>Emergencias Finalizadas</h1>
      <p>A continuación, se presenta un historial de las emergencias finalizadas
      </p>
      <div class="card" style="margin-top: 20px;">
        <div> 
          <table style="width: 100%">
            <thead>
              <tr>
                <th class="tableRow">
                  Nombre Emergencia
                </th>
                <th class="tableRow">
                  Tareas totales
                </th>
                <th class="tableRow">
                  Voluntarios participantes
                </th>
              </tr>
            </thead>
            <tbody>
              <tr style="border-bottom: #999999 1px solid">
                <td class="bodyRow">
                  ejemplo
                </td>
                <td class="bodyRow">
                  ejemplo
                </td>
                <td class="bodyRow">
                  ejemplo
                </td>
              </tr>
            </tbody>
          </table>
        </div>        
      </div>
    </div>
  </div>
</template>

<style>

h1 {
  font-weight: 700;
  font-size: 24px;
  color: #0288D1;
}
h2 {
  font-weight: 500;
  font-size: 20px;
}
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
.select {
  background-color: #fafafa;
  height: 30px;
  font-size: 16px;
  width: 100%;
  max-width: 400px;
  border-radius: 6px;
}

.tableRow {
  border-bottom: #d4d4d4 1px solid !important;
  text-align: left;
  font-weight: 600;
  color: #0288D1;
  height: 40px;
}

.bodyRow {
  border-bottom: #d4d4d4 1px solid !important;
  text-align: left;
  height: 40px;
}

.description {
  box-sizing: border-box;
  background-color: #fafafa;
  height: 30px;
  font-size: 16px;
  width: 100%;
  font-family: roboto;
  padding: 10px;
  border-radius: 6px 0px 0px 6px;
  resize: vertical;
  max-width: 100%;
  min-height: 50px;
}

.sessionButton{
  height: 50px;
  background-color: #1769aa;
  color: #f5f5f5;
  font-size: 16px;
  font-weight: 500;
  border: #1769aa solid 2px;
  border-radius: 3px;
  cursor: pointer;
  width: 100%;
  transition: background-color 0.2s;
  margin-bottom: 10px;
}
</style>
