"use client"

import React, { useState,useEffect } from 'react';
import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
import axios from 'axios';
import Link from 'next/link';





function Fiction() {
  const [data, setData] = useState([]);

  useEffect(() => {
    async function getdata() {
      try {
        const res= await axios.get("http://localhost:8082/books/fantasy")
        const d= await res.data
       
        setData(d)
     console.log(data)
        
      } catch (error) {
        
      }
    }

    getdata()

  },[]);

  return (
    <div className= "flex flex-wrap gap-5 pl-48 pr-48 ">
    

    {
     data.map((it,ind)=>(
 
      
     <Card  className='' style={{ width: '10rem' }}>
      <a href={it.id}>

      <Card.Img variant="top" src={it.img} />
      </a>
      <Card.Body>
        <Card.Title className='text-xs'>{it.title}</Card.Title></Card.Body>
    </Card>
      

     ))  
     
    }
</div>
    
  )
}

export default Fiction;
