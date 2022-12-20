import {useEffect} from 'react'
import Emo from '../imgs/emo.png'
import './content.css'
import Aos from 'aos'
import 'aos/dist/aos.css'
import ButtonPay from '../button/buttonPay'
import Robot from '../robot/robot'

const Content = () => {

    useEffect(() => {
        Aos.init({ duration: 2000 });
    }, [])

    return (
        <div className="Container-content">
            <div className="container-tittle">
                <h1>EMO: o animal de estimação de desktop de IA mais legal com personalidade e ideias.</h1>
            </div>
            <div  className="emo-subtittle">
                <div data-aos="fade-right" className='emo-img'>
                    <img src={Emo} />
                </div>
                <div data-aos="fade-left"className='emo-description'>
                    <h1>EMO ROBÔ</h1>
                    <p> Como um companheiro leal, o Emo te anima com música, movimentos de dança e jogos online! Emo também é um grande ajudante que o acorda, acende a luz, tira fotos e responde às suas perguntas, para um animal de estimação verdadeiramente realista em sua área de trabalho!</p>
                    <ButtonPay text="COMPRAR AGORA"/>
                </div>
            </div>
        </div>
    )
}

export default Content ;