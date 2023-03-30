import React from "react";
import { InfoSection } from "../../components";
import { homeObjOne, homeObjThree } from "./Data";

function SignUp() {
  return (
    <>
      <InfoSection {...homeObjThree} />
      <InfoSection {...homeObjOne} />
    </>
  );
}

export default SignUp;
