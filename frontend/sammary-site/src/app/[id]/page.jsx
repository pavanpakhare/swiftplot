"use client"
import Navc from "../camponant/Navc";
import { useState,useEffect } from "react";
import axios from "axios";
function page({params}) {
  const [data, setData] = useState([]);
  const [ob, setob] = useState({})
  const [fdata, setDataf] = useState(1);

  useEffect(() => {
    async function getdata() {
      try {
        const res= await axios.get("http://localhost:8082/books")
        const d= await res.data
       
        setData(d)
        setDataf(parseInt(params.id))
        
        
    
        
      } catch (error) {
        
      }
    }
return ()=>{
       getdata()
}


  },[]);
    return (
        <div>
            <Navc/>
               <h1></h1>

              {

                data.filter(sum=>sum.id==parseInt(params.id)).map(sum=>{
                
                    return <div key={sum.id}>
                        
                        <h1  className=' font-bold pl-48 pr-36 text-wrap text-5xl justify-center align-middle' >{sum.title}</h1>
                        <h1 className="font-bold pl-48">Author- {sum.author}</h1>
                        <h1  className='pl-48 pr-32 text-wrap text-xl '>{sum.summery}</h1>
                    </div>
                })
            }
            
        
      
        </div>
    );
}

export default page;