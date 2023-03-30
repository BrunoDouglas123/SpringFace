import React from "react";
import { homeObjOne, homeObjThree, homeObjFour } from "./Data";
import { InfoSection, Pricing } from "../../components";

function Home() {
  return (
    <>
      <InfoSection {...homeObjOne} />
      <InfoSection {...homeObjThree} />
      <InfoSection {...homeObjFour} />
      <Pricing />
    </>
  );
}

export default Home;
