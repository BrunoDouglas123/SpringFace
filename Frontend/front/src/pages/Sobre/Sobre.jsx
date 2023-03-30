import React from "react";
import "./Sobre.css";

import Carousel from "react-multi-carousel";
import "react-multi-carousel/lib/styles.css";

import Homer from "../../images/Morador/Homer.png";
import Herb from "../../images/Morador/Herb.png";
import Abbie from "../../images/Morador/Abbie.webp";
import Marge from "../../images/Morador/Marge.png";
import Patty from "../../images/Morador/Patty.png";
import Selma from "../../images/Morador/Selma.png";
import Bart from "../../images/Morador/Bart.png";
import Hugo from "../../images/Morador/Hugo.png";
import Lisa from "../../images/Morador/Lisa.png";
import Maggie from "../../images/Morador/Maggie.png";
import Ling from "../../images/Morador/Ling.png";
import Abe from "../../images/Morador/Abe.png";
import Jackie from "../../images/Morador/Jackie.png";
import Mona from "../../images/Morador/Mona.png";
import Rita from "../../images/Morador/Rita.png";
import Edwina from "../../images/Morador/Edwina.webp";
import Zia from "../../images/Morador/Zia.png";
import Skippy from "../../images/Morador/Skippy.webp";
import Jiff from "../../images/Morador/Jiff.webp";

function Sobre() {
  return (
    <>
      <div className="container">
        <div className="item1">
          <textarea> Homer Simpson</textarea>
          <img src={Homer} className="img_homer" alt="residente" />
        </div>
        <br />
        <div className="item1">
          <textarea> Herb Simpson</textarea>
          <img src={Herb} className="img_herb" alt="residente" />
        </div>
        <br />
        <div className="item1">
          <textarea> Abbie Simpson</textarea>
          <img src={Abbie} className="img_abbie" alt="residente" />
        </div>
        <br />
        <div className="item1">
          <textarea> Marge Simpson</textarea>
          <img src={Marge} className="img_marge" alt="residente" />
        </div>
        <br />
        <div className="item1">
          <textarea> Patty Bouvier</textarea>
          <img src={Patty} className="img_patty" alt="residente" />
        </div>
        <br />
        <div className="item1">
          <textarea> Selma Bouvier</textarea>
          <img src={Selma} className="img_selma" alt="residente" />
        </div>
        <br />
        <div className="item1">
          <textarea> Abe Simpson</textarea>
          <img src={Abe} className="img_abe" alt="residente" />
        </div>
        <br />
        <div className="item1">
          <textarea> Mona Simpson</textarea>
          <img src={Mona} className="img_mona" alt="residente" />
        </div>
        <br />
        <div className="item1">
          <textarea> Rita LaFleur</textarea>
          <img src={Rita} className="img_rita" alt="residente" />
        </div>
        <br />
        <div className="item1">
          <textarea> Edwina</textarea>
          <img src={Edwina} className="img_edwina" alt="residente" />
        </div>
        <br />
        <div className="item1">
          <textarea> Jackie Bouvier</textarea>
          <img src={Jackie} className="img_jackie" alt="residente" />
        </div>
        <br />
        <div className="item1">
          <textarea> Bart Simpson</textarea>
          <img src={Bart} className="img_bart" alt="residente" />
        </div>
        <br />
        <div className="item1">
          <textarea> Hugo Simpson</textarea>
          <img src={Hugo} className="img_hugo" alt="residente" />
        </div>
        <br />
        <div className="item1">
          <textarea> Lisa Simpson</textarea>
          <img src={Lisa} className="img_lisa" alt="residente" />
        </div>
        <br />
        <div className="item1">
          <textarea> Maggie Simpson</textarea>
          <img src={Maggie} className="img_maggie" alt="residente" />
        </div>
        <br />
        <div className="item1">
          <textarea> Ling Bouvier</textarea>
          <img src={Ling} className="img_ling" alt="residente" />
        </div>
        <br />
        <div className="item1">
          <textarea> Zia Simpson</textarea>
          <img src={Zia} className="img_zia" alt="residente" />
        </div>
        <br />
        <div className="item1">
          <textarea> Skippy Simpson</textarea>
          <img src={Skippy} className="img_skippy" alt="residente" />
        </div>
        <br />
        <div className="item1">
          <textarea> Jiff simpson</textarea>
          <img src={Jiff} className="img_jiff" alt="residente" />
        </div>
      </div>
    </>
  );
}

export default Sobre;
