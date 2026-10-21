import{z as e,ap as a,an as t,L as n,bz as o,bA as i,ak as l,h as r,av as b}from"./952f98a9.js";import{R as c,S as d,u as s,D as p,T as m,v,w as u,W as x,x as y,G as f}from"./216055dc.js";const k=e`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-expandable-panel--_ambient---active-link-icon-color: initial;
    --bbva-expandable-panel--_ambient---link-icon-color: initial;
    --bbva-expandable-panel--_ambient--focus-border-color: initial;
  }
`,h=e`
:host([ambient~='primary-alt']), [ambient~='primary-alt'], [data-ambient~='primary-alt'] {
    --bbva-expandable-panel--_ambient--active-link-icon-color:
        var(--bbva-expandable-panel--custom--primary-alt-ambient--active-link-icon-color,
            ${c("colorPrimaryAltLinkMainPressed",d)}););
    --bbva-expandable-panel--_ambient--link-icon-color:
        var(--bbva-expandable-panel--custom--primary-alt-ambient--link-icon-color,
            ${c("colorPrimaryAltLinkMainDefault",d)}););
    --bbva-expandable-panel--_ambient--focus-border-color: 
        var(--bbva-expandable-panel--custom--primary-alt-ambient--focus-border-color,
            ${c("colorPrimaryAltSurfaceAmbientFocus",d)});
 }
`,g=e`
:host([ambient~='secondary']), [ambient~='secondary'], [data-ambient~='secondary'] {
    --bbva-expandable-panel--_ambient--active-link-icon-color:
        var(--bbva-expandable-panel--custom--secondary-ambient--active-link-icon-color,
            ${c("colorSecondaryLinkMainPressed",d)}););
    --bbva-expandable-panel--_ambient--link-icon-color:
        var(--bbva-expandable-panel--custom--secondary-ambient--link-icon-color,
            ${c("colorSecondaryLinkMainDefault",d)}););
    --bbva-expandable-panel--_ambient--focus-border-color: 
        var(--bbva-expandable-panel--custom--secondary-ambient--focus-border-color,
            ${c("colorSecondarySurfaceAmbientFocus",d)});
}
`,_=e`
:host([ambient~='secondary-alt']), [ambient~='secondary-alt'], [data-ambient~='secondary-alt'] {
    --bbva-expandable-panel--_ambient--active-link-icon-color:
        var(--bbva-expandable-panel--custom--secondary-alt-ambient--active-link-icon-color,
            ${c("colorSecondaryAltLinkMainPressed",d)}););
    --bbva-expandable-panel--_ambient--link-icon-color:
        var(--bbva-expandable-panel--custom--secondary-alt-ambient--link-icon-color,
            ${c("colorSecondaryAltLinkMainDefault",d)}););
    --bbva-expandable-panel--_ambient--focus-border-color: 
        var(--bbva-expandable-panel--custom--secondary-alt-ambient--focus-border-color,
            ${c("colorSecondaryAltSurfaceAmbientFocus",d)});
}
`;const A=s([Object.freeze({__proto__:null,primary:k,primaryAlt:h,secondary:g,secondaryAlt:_}),p,m]),L=Object.values(A);var S=e`
:host {
  --_expandable-panel-active-link-icon-color:
    var(--bbva-expandable-panel--_ambient--active-link-icon-color,
        var(--bbva-expandable-panel--custom--primary-ambient--active-link-icon-color,
            ${c("colorPrimaryLinkMainPressed",d)}));
  --_expandable-panel-link-icon-color:
    var(--bbva-expandable-panel--_ambient--link-icon-color,
        var(--bbva-expandable-panel--custom--primary-ambient--link-icon-color,
            ${c("colorPrimaryLinkMainDefault",d)}));
  --_expandable-panel-focus-border-color:
   var(--bbva-expandable-panel--_ambient--focus-border-color,
       var(--bbva-expandable-panel--custom--primary-ambient--focus-border-color,
           ${c("colorPrimarySurfaceAmbientFocus",d)}));
}
`,$=e`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

:host {
  display: block;
  height: 3.5rem;
  box-sizing: border-box;
  text-align: center;
  --bbva-expandable-panel-color: var(--_expandable-panel-link-icon-color) ;
}

:host([focus-visible]) {
  outline: 0.125rem solid var(--_expandable-panel-focus-border-color);
  outline-offset: 0.25rem;
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

.expandable-panel {
  display: flex;
  width: 100%;
  align-items: center;
  padding: 1rem;
  border: none;
  background: none;
  cursor: pointer;
}
.expandable-panel .text {
  color: var(--bbva-expandable-panel-color);
}
.expandable-panel .icon {
  margin-left: 0.5rem;
  fill: var(--bbva-expandable-panel-color);
}
.expandable-panel:hover .text, .expandable-panel:active .text {
  --bbva-expandable-panel-color: var(--_expandable-panel-active-link-icon-color);
}
.expandable-panel:hover .icon, .expandable-panel:active .icon {
  --bbva-expandable-panel-color: var(--_expandable-panel-active-link-icon-color);
}

:host([no-padding]) .expandable-panel.desktop {
  padding-left: 0;
}

:host([loading]) {
  overflow: hidden;
  width: 6.25rem;
  height: 3.5rem;
  background-color: var(--_skeleton-default-bg-color);
  mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(black 100%, transparent 0);
  mask-position: 16px 16px, calc(60% + 30px) 16px;
  mask-repeat: no-repeat;
  mask-size: calc((50px * 2) + (16px/ 2)) 16px, 16px 16px;
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
`;class P extends(v(a(t(u(x(n)))))){static get is(){return"bbva-expandable-panel"}static get scopedElements(){return{"bbva-type-icon":y,"bbva-type-text":f}}static get properties(){return{textUnexpanded:{type:String,attribute:"text-unexpanded"},textExpanded:{type:String,attribute:"text-expanded"},foldIcon:{type:String,attribute:"fold-icon"},unfoldIcon:{type:String,attribute:"unfold-icon"},noPaddingLeft:{type:Boolean,attribute:"no-padding-left"},expanded:{type:Boolean,reflect:!0},loading:{type:Boolean,reflect:!0},_desktop:{type:Boolean,attribute:!1}}}constructor(){super(),this.expanded=!1,this.foldIcon=o(),this.unfoldIcon=i(),this.textUnexpanded="bbva-expandable-panel-text-unexpanded",this.textExpanded="bbva-expandable-panel-text-expanded",this.loading=!1,this.disabled=!1,this.noPaddingLeft=!1}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)"}}static get styles(){return[super.styles,$,S,L,l("bbva-expandable-panel-shared-styles")]}get _text(){return this.expanded?this.textExpanded:this.textUnexpanded}get _icon(){return this.expanded?this.foldIcon:this.unfoldIcon}firstUpdated(){var e;null===(e=super.firstUpdated)||void 0===e||e.call(this),this.setAttribute("aria-expanded",this.expanded),this.setAttribute("role","button")}connectedCallback(){var e;null===(e=super.connectedCallback)||void 0===e||e.call(this),this.hasAttribute("tabindex")||this.disabled||this.loading||this.setAttribute("tabindex",0),this.addEventListener("click",this._onButtonClicked),this.addEventListener("keydown",this._onKeyDown),this.addEventListener("keyup",this._onKeyUp)}disconnectedCallback(){var e;null===(e=super.disconnectedCallback)||void 0===e||e.call(this),this.removeEventListener("click",this._onButtonClicked),this.removeEventListener("keydown",this._onKeyDown),this.removeEventListener("keyup",this._onKeyUp)}_onButtonClicked(){this.expanded=!this.expanded,this.setAttribute("aria-expanded",this.expanded),this.dispatchEvent(new CustomEvent("expandable-panel-expand",{detail:this.expanded,bubbles:!0,composed:!0}))}_onKeyDown(e){32!==e.keyCode&&13!==e.keyCode||(this._onButtonClicked(),this.style.setProperty("--bbva-expandable-panel-color","var(--_expandable-panel-active-link-icon-color)"))}_onKeyUp(e){32!==e.keyCode&&13!==e.keyCode||this.style.setProperty("--bbva-expandable-panel-color","var(--_expandable-panel-link-icon-color)")}render(){return r` ${this.loading?r``:r`
          <div class="expandable-panel ${b({desktop:this._desktop})}">
            <bbva-type-text
              class="text"
              unset
              variant="spotlight"
              size="S"
              text="${this.t(this._text)}"
            ></bbva-type-text>
            <bbva-type-icon
              size="24"
              class="icon"
              data-tag-name="bbva-type-icon"
              icon="${this._icon}"
            ></bbva-type-icon>
          </div>
        `}`}}export{P as B,A as b};
