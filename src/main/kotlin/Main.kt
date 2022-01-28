
import io.reactivex.Maybe
import io.reactivex.rxkotlin.subscribeBy

fun main(args: Array<String>) {
 val maybeValue:Maybe<Int> = Maybe.just(14)//создадим наш поток и методом just объявим его как холодный, т.е. с хранением внутри него самого

    maybeValue.subscribeBy(//подпишемся на наш поток
        onComplete = { println("Completed Empty") },//реакция на досрочное завершение
        onError = { println("Error $it") },//реакция на ошибку
        onSuccess = { println("Completed with value $it")//реакция на удачное завершение
} )
}