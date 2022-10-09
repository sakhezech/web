@file:Suppress("CAST_NEVER_SUCCEEDS", "UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package Pages

import Components.*
import csstype.*
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.p
import react.useContext
import react.useState


val MainPage = FC<Props> {

    val showcases = listOf<ShowcaseWindowData>(
        ShowcaseWindowData(
            title = "HLRandomizer",
            image = "Images/hlrimg.png",
            link = "https://github.com/sakhezech/hyperlightrandomizer",
            text = "A room and item randomizer for Hyper Light Drifter. Logic written in Python and GUI written in Kotlin JavaFX",
        ),
    )

    val listOfIam = listOf<String>(
        "learning things",
        "playing HLD",
        "playing CK2",
        "reading Marx",
        "scrolling Twitter",
        "watching Youtube",
        "designing this page",
        "making something",
        "drinking coffee",
        "drinking mint tea",
        "trying to pronounce my name right",
        "basically stuck in my home",
        "listening to Transistor OST",
        "listening to VA-11 HALL-A OST",
        "watching anime with my friends",
        "not sleeping",
        "awake",
        "sleep-deprived",
        "still alive",
    )

    val randomphrase: String by useState(listOfIam.random())
    val isMobile = useContext(MobileContext)
    val buttons = listOf(
        ShowcaseWindowData(
            title = "Github",
            text = "",
            image = "Images/placeholder.png",
            link = "https://github.com/sakhezech",
        ),
        ShowcaseWindowData(
            title = "Playlist",
            text = "",
            image = "Images/placeholder.png",
            link = "https://www.youtube.com/playlist?list=PLK8NMVo15GkE-vxnM4A7UrXi4xBIdDsv-",
        ),
        ShowcaseWindowData(
            title = "SRC",
            text = "",
            image = "Images/placeholder.png",
            link = "https://www.speedrun.com/user/Sakhezech",
        ),
        ShowcaseWindowData(
            title = "Discord",
            text = "",
            image = "Images/placeholder.png",
            link = "https://discordapp.com/users/311643179009048578",
        ),
        ShowcaseWindowData(
            title = "Email",
            text = "",
            image = "Images/placeholder.png",
            link = "mailto:contact@sakhezech.ru",
        ),
        ShowcaseWindowData(
            title = "Twitch",
            text = "",
            image = "Images/placeholder.png",
            link = "https://www.twitch.tv/sakhezech",
        ),
        ShowcaseWindowData(
            title = "YT",
            text = "",
            image = "Images/placeholder.png",
            link = "https://www.youtube.com/channel/UCippMZsB041HW9Rh1WtvyhQ",
        ),
        ShowcaseWindowData(
            title = "IG",
            text = "",
            image = "Images/placeholder.png",
            link = "https://www.instagram.com/sakhezech",
        ),

    )


    TextBackground { text = "sakhezech" }
    GradientBackground{}
    div {
        css {
            fontFamily = FontFamily.monospace
            fontSize = 12.px
            color = NamedColor.white
            display = Display.flex
            flexDirection = FlexDirection.column
            justifyContent = JustifyContent.center
            alignItems = AlignItems.center
            textAlign = TextAlign.center
        }
        h1 {
            +"Hallo, I go online by "
            a {
                css {
                    color = NamedColor.white
                    hover {
                        color = NamedColor.black
                    }
                }
                href = "/pronunciation"
                +"Sakhezech"
            }
            +" and I'm ${randomphrase}."
            css{ fontFamily = "Rodondo" as FontFamily; fontSize = 3.em}
        }
        p { +"I'm a micro project creator, speedrunner" }
        p { +"My projects:" }
        div {
            css {
                display = Display.flex
                flexWrap = FlexWrap.wrap
                justifyContent = JustifyContent.center
                alignItems = AlignItems.normal
            }

            for (showcase in showcases) {
                ShowcasePolaroid {
                    title = showcase.title
                    image = showcase.image
                    link = showcase.link
                    text = showcase.text
                    size = 250.0
                }
            }

        }
        p { +"And some links:" }
        div {
            css {
                display = Display.flex
                flexWrap = FlexWrap.wrap
                justifyContent = JustifyContent.center
                alignItems = AlignItems.normal
            }

            for (button in buttons) {
                ShowcasePolaroid {
                    title = button.title
                    image = button.image
                    link = button.link
                    text = button.text
                    size = if (isMobile) { 60.0 } else { 100.0 }
                }
            }
        }
    }
}