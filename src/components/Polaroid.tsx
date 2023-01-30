import React from 'react';
import './Polaroid.css';

interface IPolaroid {
    size: number;
    img: string;
    link: string;
    title: string;
    text: string;
    desc?: string;
}

export default function Polaroid(props: IPolaroid) {

    return (
    <a className='polar_polaroid' href={props.link}>
        <img src={props.img} height={props.size} width={props.size} alt=""/>
        <div>
            <p className='polar_title'>
                {props.title}
            </p>
            <p className='polar_body'>
                {props.text}
            </p>
        </div>
    </a>
    )
}
