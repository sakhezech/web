import Polaroid from "../../components/Polaroid"
import project_list from "./projects.json"
import social_list from "./socials.json"
import iam_list from "./iam.json"
import "./mainpage.css"

export default function MainPage() {
    window.document.title = "Sakhezech"

    let iam: string = iam_list[Math.floor(Math.random() * iam_list.length)];
    let project_elements: Array<JSX.Element> = []
    let social_elements: Array<JSX.Element> = []
    project_list.forEach(element => {
        project_elements.push(<Polaroid text={element.text} img={element.img} link={element.link} title={element.title} size={250}/>)
    })
    social_list.forEach(element => {
        social_elements.push(<Polaroid text="" img="placeholder.png" link={element.link} title={element.title} size={100}/>)
    })
    return (
        <div className="page_container">
            <br />
            <span className="main_intro">Hello my name is <a href="/pronunciation">Sakhezech</a> and I'm {iam}</span><br /><br />
            I'm a micro project creator, speedrunner <br /><br />
            My projects:
            <div className="main_projects">{project_elements}</div>
            You can find me here:
            <div className="main_projects">{social_elements}</div>
        </div>
    )
}
