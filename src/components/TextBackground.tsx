import './TextBackground.css'

interface ITextBackground {
    text?: string
}

export default function TextBackground(props: ITextBackground) {
    
    let repeated_text = props.text == null ? window.document.title : props.text
    repeated_text += " "
    for (let index = 0; index < 10; index++) {
        repeated_text += repeated_text+" "
    }

    return (
        <div className='textbg_bg' data-nosnippet>{repeated_text}</div>
    )
}
