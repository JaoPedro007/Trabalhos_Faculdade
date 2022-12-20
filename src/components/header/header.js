import './header.css'

const Header = () => {
    return (
        <div className="header">
            <div className="header-content">
                <div className="logo-name">
                    <h3>Yex | Tech</h3>
                </div>
                <nav className="header-nav">
                    <ul className="header-list">
                        <li>PREÇO</li>
                        <li>MATERIAL</li>
                        <li>FEEDBACKS</li>
                    </ul>
                </nav>
            </div>
        </div>
    )
}

export default Header;