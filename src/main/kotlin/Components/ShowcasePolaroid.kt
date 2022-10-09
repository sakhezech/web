@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "CAST_NEVER_SUCCEEDS")

package Components

import csstype.*
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.p


external interface ShowcaseWindowInt: Props {
    var image:String
    var title:String
    var text:String
    var link:String
    var size:Double
}

val ShowcasePolaroid = FC<ShowcaseWindowInt> { props ->

    a {
        href = props.link
        css {
            transitionDuration = 0.1.s
            transitionTimingFunction = TransitionTimingFunction.easeIn
            transitionProperty = TransitionProperty.all
            border = Border(2.px, LineStyle.solid, NamedColor.black)
            margin = 5.px
            color = NamedColor.white
            textDecoration = None.none
            wordWrap = WordWrap.normal
            wordBreak = WordBreak.breakWord
            width = "min-content" as Width
            backgroundColor = NamedColor.transparent
            hover {
                backgroundColor = Color("#FFFFFF64")
                marginTop = 1.px
                marginBottom = 9.px
                transform = "translate(0px, -5px)" as Transform
                border = Border(2.px, LineStyle.solid, NamedColor.white)
            }
        }
        img {
            src = props.image
            height = props.size
            width = props.size
        }

        div {
            css {
                marginTop = 10.px
                marginBottom = 10.px
                marginLeft = 3.px
                marginRight = 3.px
                textAlign = TextAlign.center
            }
            p { +"${props.title} "; css { marginTop = (-3).px; fontWeight = FontWeight.bold; fontSize = 1.5.em; fontFamily = "Rodondo" as FontFamily } }
            p { +props.text; css{fontFamily = FontFamily.monospace} }
        }
    }


}