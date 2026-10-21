import{z as e,L as t,ak as a,V as r,h as i,i as o,av as n,aV as s}from"./952f98a9.js";import{R as b,S as l,u as c,Y as m,D as d,v as u,w as g,Z as p,G as h}from"./216055dc.js";var y=e`
:host {
  --_badge-reference-group-text-color:
    var(--bbva-badge-reference--_ambient--group-text-color,
       var(--bbva-badge-reference--custom--primary-ambient--group-text-color,
          ${b("colorPrimaryText02Default",l)}));
}
`;const f=e`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-badge-reference--_ambient--group-text-color: initial;
  }
`,v=e`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-badge-reference--_ambient--group-text-color: var(
      --bbva-badge-reference--custom--primary-alt-ambient--group-text-color,
      ${b("colorPrimaryAltText02Default",l)}
    );
  }
`,x=e`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-badge-reference--_ambient--group-text-color: var(
      --bbva-badge-reference--custom--secondary-ambient--group-text-color,
      ${b("colorSecondaryText02Default",l)}
    );
  }
`,k=e`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-badge-reference--_ambient--group-text-color: var(
      --bbva-badge-reference--custom--secondary-alt-ambient--group-text-color,
      ${b("colorSecondaryAltText02Default",l)}
    );
  }
`;const _=c([Object.freeze({__proto__:null,primary:f,primaryAlt:v,secondary:x,secondaryAlt:k}),m,d]),$=Object.values(_);var w=e`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

:host {
  --bbva-badge-reference-height: 1.5rem;
  display: flex;
  height: var(--bbva-badge-reference-height);
  box-sizing: border-box;
  align-items: center;
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

[data-tag-name=bbva-clip-box] {
  margin-right: 0.5rem;
}

.group {
  color: var(--_badge-reference-group-text-color);
}

:host,
:host([align-left]) {
  justify-content: flex-start;
}

:host([align-center]) {
  justify-content: center;
}

:host([align-right]) {
  justify-content: flex-end;
}

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

:host([loading]) {
  overflow: hidden;
  width: 100%;
  height: var(--bbva-badge-reference-height);
  background-color: var(--_skeleton-default-bg-color);
  mask-image: radial-gradient( 24px 100%, black 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, black 50%);
  mask-position: 0 0, 32px 4px;
  mask-repeat: no-repeat;
  mask-size: 24px 24px, calc((32px * 2) + (16px/ 2)) 16px;
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
`;class E extends(u(g(t))){static get is(){return"bbva-badge-reference"}static get scopedElements(){return{"bbva-clip-box":p,"bbva-type-text":h}}static get properties(){return{entities:{type:Array},number:{type:String},showRawNumber:{type:Boolean,attribute:"show-raw-number"},maskChar:{type:String,attribute:"mask-char"},visibleChars:{type:Number,attribute:"visible-chars"},loading:{type:Boolean,reflect:!0},accessibilityText:{type:String,attribute:"accessibility-text"},staticEntity:{type:Boolean,attribute:"static-entity"},hideDarkEntity:{type:Boolean,attribute:"hide-dark-entity"},dummyEntityImage:{type:String,attribute:"dummy-entity-image"}}}constructor(){super(),this.showRawNumber=!1,this.maskChar="•",this.visibleChars=4,this.loading=!1,this.staticEntity=!1,this.hideDarkEntity=!1,this.dummyEntityImage="https://assets.bbvaexperience.com/visual/icons/entities/dummy.svg"}static get styles(){return[super.styles,w,y,$,a("bbva-badge-reference-shared-styles")]}set number(e){const t=this._number;this._number=r(e,this.maskChar,!this.showRawNumber,this.visibleChars),this.requestUpdate("number",t)}get number(){return this._number}get _clipBox(){return i`
      <bbva-clip-box
        .mode="${this.mode}"
        .ambient="${this.ambient}"
        ?static-entity="${this.staticEntity}"
        .group="${this.entities}"
        ?hide-dark-entity="${this.hideDarkEntity}"
        dummy-entity-image="${this.dummyEntityImage}"
        size="xs"
      >
      </bbva-clip-box>
    `}get _showNumber(){var e;return i` <bbva-type-text
        aria-hidden="${o(this.accessibilityText?"true":void 0)}"
        class="${n({group:(null===(e=this.entities)||void 0===e?void 0:e.length)>1})}"
        tag="span"
        size="S"
        font-style="italic"
        text="${this.number}"
      >
      </bbva-type-text>
      ${this.accessibilityText?i`<span class="sr-only">${this.accessibilityText}</span>`:s}`}get _showResult(){var e;return i`
      ${null!==(e=this.entities)&&void 0!==e&&e.length?i`${this._clipBox} ${this._showNumber}`:i`${this._showNumber}`}
    `}render(){return i` ${this.loading?i``:i`${this._showResult}`}`}}export{E as B,_ as b};
