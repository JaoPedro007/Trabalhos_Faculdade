import image1 from '../imgs/1.png'
import image2 from '../imgs/2.png'
import './aliveEmo.css' 
import {useEffect} from 'react'
import Aos from 'aos'
import 'aos/dist/aos.css'
import {TiMicrophoneOutline, TiUserOutline} from 'react-icons/ti'
import { FaHeadset, FaRegLightbulb} from 'react-icons/fa'
import {CgSmileMouthOpen} from 'react-icons/cg'
import {BiBookReader} from 'react-icons/bi'

export default function AliveEmo() {

    useEffect(() => {
        Aos.init({ duration: 2000 });
    }, [])

    return (
        <div className="alive-container">
            <div className="alive-content">
                <h1>O QUE FAZ O EMO GANHAR VIDA?</h1>
                <div className="alive-images">
                    <img data-aos="fade-right" src={image1}/>
                    <img data-aos="fade-left" src={image2}/>
                </div>
                <div className="alive-text">
                    <p>Com mais de 10 sensores internos avançados, Emo sabe o que está acontecendo ao seu redor. Seu processador de rede neural integrado e modelos de processamento de IA processam grandes quantidades de imagens, sons e dados de sensores continuamente, tornando-o inteligente o suficiente para interações humanas significativas.</p>
                </div>
                <div className="alive-textlist">
                    <h1 data-aos="fade-down">O QUE O EMO PODE FAZER?</h1>
                    <ul data-aos="zoom-in" className='alive-list'>
                        <li><TiUserOutline/>VER: O Emo possui uma câmera HD com reconhecimento facial que pode lembrar você e seus familiares. Ele conhece você vendo você todos os dias.</li>
                        <li><FaHeadset/> Ouvir: O Emo possui um conjunto de 4 microfones que pode capturar sons e localizar a direção da fonte instantaneamente. Se você precisar dele, basta dizer “Ei Emo!”</li>
                        <li><CgSmileMouthOpen/>Sentir: Emo está equipado com um sensor de toque em sua cabeça, que lhe permite sentir seu toque. Como qualquer animal de estimação, ele gosta de um tapinha na cabeça.</li>
                        <li><TiMicrophoneOutline/>Comunique-se: o alto-falante de alta qualidade do Emo pode reproduzir sua lista de reprodução favorita e se comunicar com você com sons simulados adoráveis.</li>
                        <li><BiBookReader/>Aprender: O sistema de autoaprendizagem do Emo permite que ele entenda o mundo ao seu redor e se familiarize com você e com o ambiente. Sua personalidade e ações mudam à medida que seu relacionamento com o mundo evolui.</li>
                        <li><FaRegLightbulb/>Pensar: Emo possui um processador de rede neural avançado e três modelos de processamento de IA diferentes, que permitem processar grandes quantidades de imagens, sons e dados de sensores simultaneamente para pensar e responder de maneira pensativa, autêntica e natural.</li>
                    </ul>
                </div>
            </div>
        </div>
    )
}