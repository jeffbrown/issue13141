package issue13141

class DemoController {

    def first() {
        flash.genre = 'Jam Band'
        redirect action: 'second'
    }

    def second() {
        render "Genre: ${flash.genre}"
    }
}
