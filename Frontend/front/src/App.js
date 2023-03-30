import React from "react";
import GlobalStyle from "./globalStyles";
import Home from "./pages/HomePage/Home";
import Cadastro from "./pages/Cadastro/Cadastro";
import Favoritos from "./pages/Favoritos/Favoritos";
import Episodio from "./pages/Episodios/Episodio";
import Noticia from "./pages/Noticia/Noticia";
import Sobre from "./pages/Sobre/Sobre.jsx";
import SignUp from "./pages/SignUp/SignUp";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import ScrollToTop from "./components/ScrollToTop";
import { Navbar, Footer } from "./components";

function App() {
  return (
    <Router>
      <GlobalStyle />
      <ScrollToTop />
      <Navbar />
      <Switch>
        <Route path="/" exact component={Home} />
        <Route path="/cadastro" component={Cadastro} />
        <Route path="/favoritos" component={Favoritos} />
        <Route path="/episodios" component={Episodio} />
        <Route path="/noticias" component={Noticia} />
        <Route path="/sobre" component={Sobre} />
        <Route path="/sign-up" component={SignUp} />
      </Switch>
      <Footer />
    </Router>
  );
}

export default App;
