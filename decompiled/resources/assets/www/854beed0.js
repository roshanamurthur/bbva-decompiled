import{z as t,an as e,L as a,ak as o,h as i}from"./952f98a9.js";import{u as r,v as n,w as s,x as l,y as c}from"./216055dc.js";var b=t`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

:host([loading]) {
  width: 3rem;
  height: 2rem;
  background-color: var(--_skeleton-default-bg-color);
  mask-image: linear-gradient(black 100%, transparent 0);
  mask-position: 0 0;
  mask-repeat: no-repeat;
  mask-size: 48px 32px;
  pointer-events: none;
  /* 
  &::after {
     display: block;
     width: 100%;
     height: 100%;
     animation: skeletonAnimation 1500ms ease-in 100ms infinite alternate-reverse;
     background-color: var(--_skeleton-default-animated-bg-color);
     background-repeat: no-repeat;
     content: '';
     object-fit: cover;
     opacity: 0.1;
   }
   @keyframes skeletonAnimation {
     0% {
       opacity: 0.1;
     }
     100%{
       opacity: 1;
     }
   }*/
}
:host([loading])::after {
  display: block;
  width: 100%;
  height: 100%;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background-color: var(--_skeleton-default-animated-bg-color);
  background-image: linear-gradient(var(--_skeleton-default-bg-color) 100%, transparent 0);
  background-position-x: 100vh;
  background-repeat: no-repeat;
  content: "";
  object-fit: cover;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
}
@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    opacity: 0;
    transform: translateX(0%) scaleX(2);
  }
}

:host([loading][size=small]) {
  width: 2rem;
  height: 1.5rem;
  background-color: var(--_skeleton-default-bg-color);
  mask-image: linear-gradient(black 100%, transparent 0);
  mask-position: 0 0;
  mask-repeat: no-repeat;
  mask-size: 32px 24px;
  pointer-events: none;
  /* 
  &::after {
     display: block;
     width: 100%;
     height: 100%;
     animation: skeletonAnimation 1500ms ease-in 100ms infinite alternate-reverse;
     background-color: var(--_skeleton-default-animated-bg-color);
     background-repeat: no-repeat;
     content: '';
     object-fit: cover;
     opacity: 0.1;
   }
   @keyframes skeletonAnimation {
     0% {
       opacity: 0.1;
     }
     100%{
       opacity: 1;
     }
   }*/
}
:host([loading][size=small])::after {
  display: block;
  width: 100%;
  height: 100%;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background-color: var(--_skeleton-default-animated-bg-color);
  background-image: linear-gradient(var(--_skeleton-default-bg-color) 100%, transparent 0);
  background-position-x: 100vh;
  background-repeat: no-repeat;
  content: "";
  object-fit: cover;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
}
@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    opacity: 0;
    transform: translateX(0%) scaleX(2);
  }
}
`;const d=r([],!0),m=Object.values(d);class p extends(n(e(s(a)))){static get scopedElements(){return{"bbva-type-icon":l}}static get is(){return"bbva-clip-flag"}static get properties(){return{size:{type:String},icon:{type:String},width:{type:Number},height:{type:Number},src:{type:String,atribute:"src"},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.icon=c(),this.src="",this.loading=!1}static get _sizes(){return{small:{width:36,height:24},medium:{width:48,height:32}}}set _sizes(t){const e=this.constructor._sizes,a=e.hasOwnProperty(t)?t:"medium";this.width=e[a].width,this.height=e[a].height}updated(t){super.updated(t),t.has("size")&&(this._sizes=this.size)}static get styles(){return[super.styles,b,m,o("bbva-clip-flag-shared-styles")]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.disabled||this.setAttribute("role","presentation")}get _iconSrc(){return""!==this.src?i`
        <bbva-type-icon
          src="${this.src}"
          width="${this.width}"
          height="${this.height}"
        ></bbva-type-icon>
      `:i`
      <bbva-type-icon
        icon="${this.icon}"
        width="${this.width}"
        height="${this.height}"
      ></bbva-type-icon>
    `}render(){return i` ${this.loading?i``:i` ${this._iconSrc}`} `}}export{p as B,d as b};
