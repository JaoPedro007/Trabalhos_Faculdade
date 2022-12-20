import {RiFacebookLine} from 'react-icons/ri'
import {FiInstagram, FiTwitter, FiLinkedin} from 'react-icons/fi'
import './footer.css'


const Footer = () => {
    return(
        <div className="footer-container">
            <div className="footer-content">
                <nav>
                    <ul>
                        <li><a target={"_blank"} href="https://www.facebook.com/profile.php?id=100007255991838"><RiFacebookLine/></a></li>
                        <li><a target={"_blank"} href="https://www.instagram.com/joao.pedro.leite/"><FiInstagram/></a></li>
                        <li><a target={"_blank"} href="https://www.linkedin.com/in/joão-pedro-rodrigues-leite-038537167/"><FiLinkedin/></a></li>
                    </ul>
                </nav>
                <h3>Entre em contato comigo!</h3>
                <h3>Desenvolvidor por João Pedro</h3>
            </div>
        </div>
    )
}

export default Footer;