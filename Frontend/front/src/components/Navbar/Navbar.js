import React, { useState, useEffect } from "react";
import "./Navbar.css";
import { FaBars, FaTimes } from "react-icons/fa";
import { IconContext } from "react-icons/lib";
import { Button } from "../../globalStyles";
import {
  Nav,
  NavbarContainer,
  NavLogo,
  NavIcon,
  MobileIcon,
  NavMenu,
  NavItem,
  NavItemBtn,
  NavLinks,
  NavBtnLink,
} from "./Navbar.elements";

function Navbar() {
  const [click, setClick] = useState(false);
  const [button, setButton] = useState(true);

  const handleClick = () => setClick(!click);
  const closeMobileMenu = () => setClick(false);

  const showButton = () => {
    if (window.innerWidth <= 960) {
      setButton(false);
    } else {
      setButton(true);
    }
  };

  useEffect(() => {
    showButton();
  }, []);

  window.addEventListener("resize", showButton);

  return (
    <>
      <IconContext.Provider value={{ color: "#fff" }}>
        <Nav>
          <NavbarContainer>
            <NavLogo to="/" onClick={closeMobileMenu}>
              <NavIcon />
              SPRINGFACE
            </NavLogo>
            <MobileIcon onClick={handleClick}>
              {click ? <FaTimes /> : <FaBars />}
            </MobileIcon>
            <NavMenu onClick={handleClick} click={click}>
              <NavItem>
                <NavLinks to="/noticias" onClick={closeMobileMenu}>
                  Noticias
                </NavLinks>
              </NavItem>
              <NavItem>
                <NavLinks to="/episodios" onClick={closeMobileMenu}>
                  Episódios
                </NavLinks>
              </NavItem>

              <NavItem>
                <NavLinks to="/sobre" onClick={closeMobileMenu}>
                  Sobre
                </NavLinks>
              </NavItem>
              <NavItemBtn>
                {button ? (
                  <NavBtnLink to="/cadastro">
                    <Button primary>LOGIN</Button>
                    <Button className="cadaster" primary>
                      CADASTRAR
                    </Button>
                  </NavBtnLink>
                ) : (
                  <div className="funcao">
                    <NavBtnLink to="/">
                      <Button onClick={closeMobileMenu} fontBig primary>
                        LOGIN
                      </Button>
                    </NavBtnLink>
                    <NavBtnLink to="/cadastro">
                      <Button onClick={closeMobileMenu} fontBig primary>
                        CADASTRO
                      </Button>
                    </NavBtnLink>
                  </div>
                )}
              </NavItemBtn>
            </NavMenu>
          </NavbarContainer>
        </Nav>
      </IconContext.Provider>
    </>
  );
}

export default Navbar;
