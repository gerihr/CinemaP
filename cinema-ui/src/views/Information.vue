<template>
  <form>
    <div class="form-row">
      <div class="form-group col-md-6">
        <label for="inputtitlel4">Заглавие</label>
        <input type="title" class="form-control" id="inputtitlel4" :key="film.name">
      </div>
      <div class="form-group col-md-6">
        <label for="inputgenre4">Жанр</label>
        <input type="genre" class="form-control" id="inputgenre4" :key="film.genre">
      </div>
    </div>
    <div class="form-group">
      <label for="inputAddress">Актьори</label>
      <input type="text" class="form-control" id="inputAddress" :key="film.film_actors" >
    </div>
    <div class="form-group">
      <label for="inputAddress2">Резюме 2</label>
      <input type="text" class="form-control" id="inputAddress2" :key="film.summary">
    </div>
  </form>
</template>

<script>
import NewService from '../services/new-service'

export default {
  name: 'Information',
  data: function () {
    return {
      film: [{
        video_format: '',
        id: '',
        name: '',
        ticket_price: '',
        genre: '',
        cover_art: '',
        summary: '',
        film_actors:
          {
            id: '',
            name: ''
          }
      }]
    }
  },
  beforeRouteEnter (to, from, next) {
    if (to.params.id) {
      NewService.getFilmById(to.params.id).then(
        response =>
          next(vm =>
            vm.setData(response))
      )
    } else {
      next()
    }
  },
  methods: {
    setData (response) {
      this.film = response.data
    }
  }
}
</script>

<style scoped>

</style>
