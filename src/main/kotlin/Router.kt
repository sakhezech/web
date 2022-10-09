import Components.MobileContext
import Pages.MainPage
import Pages.Pronunciation
import kotlinx.browser.window
import react.FC
import react.Props
import react.createElement
import react.router.Route
import react.router.Routes
import react.router.dom.BrowserRouter
import react.useState

val Router = FC<Props> {

    val MOBILE_QUERY = "(max-width: 1080px)"
    var ismobile: Boolean by useState(window.matchMedia(MOBILE_QUERY).matches)
    window.onresize = {
        if (ismobile != window.matchMedia(MOBILE_QUERY).matches) {
            ismobile = window.matchMedia(MOBILE_QUERY).matches
        }
    }



    MobileContext.Provider (ismobile) {
        BrowserRouter {
            Routes {
                Route {
                    index = true
                    element = createElement(MainPage)
                }

                Route {
                    path = "/pronunciation"
                    element = createElement(Pronunciation)
                }
            }

        }
    }


}