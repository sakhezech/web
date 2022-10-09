@file:Suppress("CAST_NEVER_SUCCEEDS", "UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package Components

import csstype.*
import emotion.css.keyframes
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.div

val GradientBackground = FC<Props> {
    div {
        css {
            val movement = keyframes {
                0.pct { backgroundPositionX = 0.pct }
                100.pct { backgroundPositionX = 100.pct }
            }
            background = linearGradient(45.deg, Color("#ee7752"), Color("#e73c7e"), Color("#23a6d5"), Color("#23d5ab"))
            backgroundSize = "300% 300%" as BackgroundSize
            position = Position.fixed
            backgroundPositionY = 50.pct
            top = 0.px
            left = 0.px
            height = 120.pct
            width = 100.pct
            zIndex = -2 as ZIndex
            overflow = Overflow.hidden
            animationName = movement
            animationDuration = 7.5.s
            animationIterationCount = AnimationIterationCount.infinite
            animationDirection = AnimationDirection.alternate
            animationTimingFunction = AnimationTimingFunction.easeIn
        }
    }
}