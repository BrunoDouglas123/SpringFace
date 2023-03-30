import React from "react";
import "./Cadastro.css";
import wallpaper from "../../images/login.jpg";

function Cadastro() {
  return (
    <div className="container">
      <div className="cburns">
        <img src={wallpaper} className="burns" alt="burns" />
      </div>
      <div className="formulario">
        <form action="">
          <h1 id="titulo">Crie sua Conta</h1>
          <input id="campo" type="text" placeholder="Nome" required />
          <br></br>
          <input id="campo" type="email" placeholder="Email" required />
          <br></br>
          <input id="campo" type="password" placeholder="Senha" required />
          <br></br>
          <input
            id="campo"
            type="password"
            placeholder="Confirmação de Senha"
            required
          />
          <br></br>
          <div className="play">
            <input className="login" type="sign" placeholder="Cadastrar" />
            <input className="login" type="submit" />
          </div>
        </form>
      </div>
    </div>
  );
}

export default Cadastro;
