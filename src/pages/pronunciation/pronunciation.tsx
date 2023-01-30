import "./pronunciation.css"

export default function Pronunciation() {
    window.document.title = "Pronunciation"

    return (
        <div className="page_container pronun_container">
            <p className="pronun_title">
                SAKHEZECH
            </p>
            <span className="pronun_ipa">
                [sa'xʲezʲetɕ] or ['saxa] or ['sax]
            </span>
            <span className="pronun_video">
                Video <a href="https://youtu.be/YXbeNQSWPGw">here</a>
            </span>
        </div>
    )
}
