import './robot.css'
import {useEffect} from 'react'
import Aos from 'aos'
import 'aos/dist/aos.css'

const Robot = () => {

    useEffect(() => {
        Aos.init({ duration: 2000 });
    }, [])

    return (
        <div className="robot-description">
                <div className="robot-tittle">
                    <h1>UM ROBO PARA CHAMAR DE SEU!</h1>
                </div>
                <div
                data-aos="fade-right"
                data-aos-offset="200"
                data-aos-easing="ease-in-sine" 
                className="robot-gif">
                    <img src="https://i0.wp.com/living.ai/wp-content/uploads/2020/12/Details02.gif?fit=680%2C383&ssl=1"/>
                </div>
                <div
                data-aos="fade-right"
                data-aos-offset="200"
                data-aos-easing="ease-in-sine" 
                className="robot-text">
                    <p>Emo é curioso e curioso sobre o mundo ao seu redor. Ele se move de forma independente para explorar seus arredores por conta própria. Ele rastreia sons, reconhece pessoas (até 10 pessoas) e objetos e navega habilmente em sua área de trabalho sem nunca cair.

                    Emo toma decisões por conta própria e sua personalidade evolui com base em seu entorno e suas interações. Se você tentar interromper o que ele está fazendo, ele pode até ficar um pouco irritado.</p>
                </div>
        </div>
    )
}

export default Robot;