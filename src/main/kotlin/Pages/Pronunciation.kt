@file:Suppress("CAST_NEVER_SUCCEEDS", "UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package Pages

import Components.GradientBackground
import Components.TextBackground
import csstype.*
import emotion.react.css
import kotlinx.browser.window
import react.FC
import react.Props
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.p

val Pronunciation = FC<Props> {
    window.document.title = "Pronunciation"
    div {
        css {
            fontFamily = FontFamily.monospace
            color = NamedColor.white
            display = Display.flex
            flexDirection = FlexDirection.column
            justifyContent = JustifyContent.center
            alignItems = AlignItems.center
            textAlign = TextAlign.center
            height = 100.pct
            width = 100.pct
            position = Position.absolute
            top = 0.px
            left = 0.px
            margin = 0.px
            maxWidth = 100.pct

        }
        div {
            css {
                // THIS IS NOT OKAY CHANGE THIS
                if (window.matchMedia("(max-width: 390px)").matches) {
                    val x: Double = window.innerWidth/390.0
                    transform = "scale($x, $x)" as Transform
                }
            }
            p {
                +"SAKHEZECH"
                css {
                    fontFamily = "Rodondo" as FontFamily
                    fontWeight = FontWeight.bold
                    fontSize = 100.px
                    margin = 0.px
                }
            }
            p {
                +"[sa'xʲezʲetɕ] or ['saxa] or ['sax]"
                css {
                    fontSize = 40.px
                    margin = 0.px
                }
            }
            p {
                +"Video "
                a {
                    href = "https://youtu.be/_0nVfTp8TZ4"
                    +"here"
                    css {
                        color = NamedColor.white
                        hover { color = NamedColor.black }
                    }
                }
                css { fontSize = 15.px; margin = 0.px }
            }
        }
    }



    TextBackground {
        text = window.document.title
    }
    GradientBackground{}


}