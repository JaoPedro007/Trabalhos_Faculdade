import Header from '../components/header/header'
import Content from '../components/content/content'
import Robot from '../components/robot/robot'
import AliveEmo from '../components/robot/aliveEmo'
import Footer from '../components/footer/footer'

export default function Main() {
    return (
        <div className="conteiner">
            <Header/>
            <Content />
            <Robot />
            <AliveEmo/>
            <Footer/>
        </div>
    )
}