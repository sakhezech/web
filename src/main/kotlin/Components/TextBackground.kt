@file:Suppress("CAST_NEVER_SUCCEEDS", "UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package Components

import csstype.*
import emotion.css.keyframes
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.div

external interface TextInt: Props {
    var text: String
}

val TextBackground = FC<TextInt> { props ->
    div {
        val blink = keyframes {
            0.pct   {opacity = 0 as Opacity}
            50.pct   {opacity = 0.05 as Opacity}
            100.pct {opacity = 0 as Opacity}
        }
        css {
            //CONTAINER
            position = Position.fixed
            top = 0.px
            left = 0.px
            //SIZE
            height = 100.pct
            width = 100.pct
            //DESIGN
            fontFamily = "Rodondo" as FontFamily
            fontSize = 100.px
            zIndex = -1 as ZIndex
            overflow = Overflow.hidden
            userSelect = None.none
            color = NamedColor.black
            textAlign = TextAlign.center
            wordBreak = WordBreak.breakAll
            //ANIMATION
            animationName = blink
            animationDuration = 10.s
            animationIterationCount = AnimationIterationCount.infinite
            animationDirection = AnimationDirection.normal

        }
        var textShown = ""
        for (i in 1..1000) {textShown += "${props.text} "}
        +textShown
    }
}

