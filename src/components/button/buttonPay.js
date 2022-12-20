import './buttonPay.css';

const ButtonPay = (props) => {

    return (
        <div className="button-container">
           <button className="btn-pay"><a href={props.link}>{props.text}</a></button>
        </div>
    )
}

export default ButtonPay;