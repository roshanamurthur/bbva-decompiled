import{z as e,an as t,L as i,ak as a,h as s,av as r,a8 as o,be as l,cv as n,bF as c,cw as d,cx as p,cy as b,cz as h,i as u,aO as m}from"./952f98a9.js";import{R as g,S as v,u as A,D as f,v as y,G as w,V as _,ai as k,W as x,f as S}from"./216055dc.js";import{B,a as C}from"./be12d7a2.js";import{A as $,K as P}from"./72e6e777.js";var I=e`
:host {
  display: flex;
  box-sizing: border-box;
  align-items: center;
  padding-left: 0;
  --_carousel-default-step-bar-width: 4.75rem;
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

.stepbar {
  display: grid;
  min-width: var(--_carousel-default-step-bar-width);
  max-width: var(--_carousel-default-step-bar-width);
  align-items: center;
  grid-auto-flow: column;
  grid-template-columns: repeat(3, 1fr);
  justify-items: end;
  overflow-x: hidden;
}
.stepbar .bar {
  width: 1rem;
  flex: 1 0 auto;
  border: 0.0625rem solid var(--_carousel-default-step-bar-border-color);
  border-radius: 0.0625rem;
  margin-left: 0.25rem;
  opacity: 0.7;
  transform: scale(1);
  transition: all 0.3s ease-in-out 0.1s, transform 0.3s ease-in-out;
}
.stepbar .bar:first-of-type {
  margin-left: 0;
}
.stepbar .bar.selected {
  width: 2rem;
  border: 0.0625rem solid var(--_carousel-default-step-bar-border-color-active);
  opacity: 1;
  transform: scale(1.2);
}

.only-item {
  --_carousel-default-step-bar-width: 2.5rem;
}

:host [data-tag-name=bbva-type-text] {
  margin-left: 0.5rem;
  color: var(--_carousel-default-step-bar-border-color-active);
}

:host([full-screen]) .stepbar .bar:not(.selected) {
  border: 0.0625rem solid var(--_carousel-default-step-bar-border-color-alternative);
}
`,D=e`
:host {
  --_carousel-default-step-bar-border-color:
    var(--bbva-carousel-default-step-bar--_ambient--border-color,
      var(--bbva-carousel-default-step-bar--custom--primary-ambient--border-color,
        ${g("colorPrimarySurfaceAmbientPreloading",v)}));
  --_carousel-default-step-bar-border-color-active:
    var(--bbva-carousel-default-step-bar--_ambient--border-color-active,
      var(--bbva-carousel-default-step-bar--custom--primary-ambient--border-color-active,
        ${g("colorPrimarySelectionInteraction01BackgroundSelected",v)}));
  --_carousel-default-step-bar-border-color-alternative:
    var(--bbva-carousel-default-step-bar--_ambient--border-color-alternative,
      var(--bbva-carousel-default-step-bar--custom--primary-ambient--border-color-alternative,
        ${g("colorPrimarySurfaceAmbientDefault",v)}));
}
`;const E=e`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-carousel-default-step-bar--_ambient--border-color: initial;
    --bbva-carousel-default-step-bar--_ambient--border-color-active: initial;
    --bbva-carousel-default-step-bar--_ambient--border-color-alternative: initial;
  }
`,Y=e`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-carousel-default-step-bar--_ambient--border-color: var(
      --bbva-carousel-default-step-bar--custom--primary-alt-ambient--border-color,
      ${g("colorPrimaryAltSurfaceAmbientPreloading",v)}
    );

    --bbva-carousel-default-step-bar--_ambient--border-color-active: var(
      --bbva-carousel-default-step-bar--custom--primary-alt-ambient--border-color-active,
      ${g("colorPrimaryAltSelectionInteraction01BackgroundSelected",v)}
    );

    --bbva-carousel-default-step-bar--_ambient--border-color-alternative: var(
      --bbva-carousel-default-step-bar--custom--primary-alt-ambient--border-color-alternative,
      ${g("colorPrimaryAltSurfaceAmbientDefault",v)}
    );
  }
`,L=e`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-carousel-default-step-bar--_ambient--border-color: var(
      --bbva-carousel-default-step-bar--custom--secondary-ambient--border-color,
      ${g("colorSecondarySurfaceAmbientPreloading",v)}
    );

    --bbva-carousel-default-step-bar--_ambient--border-color-active: var(
      --bbva-carousel-default-step-bar--custom--secondary-ambient--border-color-active,
      ${g("colorSecondarySelectionInteraction01BackgroundSelected",v)}
    );

    --bbva-carousel-default-step-bar--_ambient--border-color-alternative: var(
      --bbva-carousel-default-step-bar--custom--secondary-ambient--border-color-alternative,
      ${g("colorSecondarySurfaceAmbientDefault",v)}
    );
  }
`,G=e`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-carousel-default-step-bar--_ambient--border-color: var(
      --bbva-carousel-default-step-bar--custom--secondary-alt-ambient--border-color,
      ${g("colorSecondaryAltSurfaceAmbientPreloading",v)}
    );

    --bbva-carousel-default-step-bar--_ambient--border-color-active: var(
      --bbva-carousel-default-step-bar--custom--secondary-alt-ambient--border-color-active,
      ${g("colorSecondaryAltSelectionInteraction01BackgroundSelected",v)}
    );

    --bbva-carousel-default-step-bar--_ambient--border-color-alternative: var(
      --bbva-carousel-default-step-bar--custom--secondary-alt-ambient--border-color-alternative,
      ${g("colorSecondaryAltSurfaceAmbientDefault",v)}
    );
  }
`;const j=A([Object.freeze({__proto__:null,primary:E,primaryAlt:Y,secondary:L,secondaryAlt:G}),f]),z=Object.values(j);class T extends(t(y(i))){static get is(){return"bbva-step-bar"}static get scopedElements(){return{"bbva-type-text":w}}static get properties(){return{iconSelected:{type:Boolean,attribute:"icon-selected",reflected:!0},items:{type:Number},selected:{type:Number},scrollPosition:{type:Number,attribute:"scroll-position"},columns:{type:Number},fullScreen:{type:Boolean,attribute:"full-screen",reflect:!0},loop:{type:Boolean,reflect:!0}}}constructor(){super(),this.selected=0,this.canAdd=!1,this.iconSelected=!1,this.scrollPosition=0,this.columns=1,this.fullScreen=!1,this.loop=!1}updated(e){super.updated(e),e.has("scrollPosition")&&this._smoothScrollToPosition(300)}_onNextSlide(){const e=this.shadowRoot.querySelector(".first"),t=this.shadowRoot.querySelector(".second");e.classList.add("selected"),t.classList.remove("selected"),setTimeout((()=>{e.classList.remove("selected"),t.classList.add("selected")}),500)}_onPrevSlide(){const e=this.shadowRoot.querySelector(".third"),t=this.shadowRoot.querySelector(".second");e.classList.add("selected"),t.classList.remove("selected"),setTimeout((()=>{e.classList.remove("selected"),t.classList.add("selected")}),500)}static _easeInOutQuad(e){return e<.5?2*e*e:1-(-2*e+2)**2/2}_smoothScrollToPosition(e=1e3){const t=this._stpBarCtn.scrollLeft,i=this.scrollPosition-t;let a;const s=r=>{a||(a=r);const o=r-a,l=Math.min(o/e,1);this._stpBarCtn.scrollLeft=t+i*T._easeInOutQuad(l),l<1&&requestAnimationFrame(s)};requestAnimationFrame(s)}get _stpBarCtn(){return this._stepbar||(this._stepbar=this.shadowRoot.querySelector(".stepbar")),this._stepbar}get _items(){const e=this.items>0?this.items:1,t=this.loop?this.items+2:e;return Array(t).fill(void 0)}static get styles(){return[D,I,z,a("bbva-step-bar-shared-styles")]}_minMaxValues(){const e=this.selected<0?1:this.selected+1,t=this.items<1?1:this.items;return this.t("bbva-carousel-default-value-min-max",{slide:e,totalSlides:t})}get _stepBar(){return s`
      <div
        class="stepbar ${r({"only-item":1===this._items.length})}"
        .scrollLeft="${this.scrollPosition}"
      >
        ${this._items.map(((e,t)=>{const i=(this.selected===t||this.selected<0)&&!this.loop||this.loop&&t===this.selected+1;return s`<div class="bar ${i?"selected":""}"></div>`}))}
      </div>
    `}static get _stepBarLoop(){return s`
      <div class="stepbar">
        <div class="bar first"></div>
        <div class="bar second selected"></div>
        <div class="bar third"></div>
      </div>
    `}get _sliderIndicator(){return s`
      <bbva-type-text
        tag="span"
        font-style="italic"
        size="2XS"
        .text="${this._minMaxValues()}"
      ></bbva-type-text>
    `}render(){return s`
      ${this.loop?this.constructor._stepBarLoop:this._stepBar} ${this._sliderIndicator}
    `}}var M=e`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

@font-face {
  font-family: "swiper-icons";
  src: url("data:application/font-woff;charset=utf-8;base64, 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") format("woff");
  font-weight: 400;
  font-style: normal;
}
:root {
  --swiper-theme-color: #007aff;
}

.swiper-container {
  margin-left: auto;
  margin-right: auto;
  position: relative;
  overflow: hidden;
  list-style: none;
  padding: 0;
  /* Fix of Webkit flickering */
  z-index: 1;
}

.swiper-container-vertical > .swiper-wrapper {
  flex-direction: column;
}

.swiper-wrapper {
  position: relative;
  width: 100%;
  height: 100%;
  z-index: 1;
  display: flex;
  transition-property: transform;
  box-sizing: content-box;
}

.swiper-container-android .swiper-slide,
.swiper-wrapper {
  transform: translate3d(0px, 0, 0);
}

.swiper-container-multirow > .swiper-wrapper {
  flex-wrap: wrap;
}

.swiper-container-multirow-column > .swiper-wrapper {
  flex-wrap: wrap;
  flex-direction: column;
}

.swiper-container-free-mode > .swiper-wrapper {
  transition-timing-function: ease-out;
  margin: 0 auto;
}

.swiper-container-pointer-events {
  touch-action: pan-y;
}
.swiper-container-pointer-events.swiper-container-vertical {
  touch-action: pan-x;
}

.swiper-slide {
  flex-shrink: 0;
  width: 100%;
  height: 100%;
  position: relative;
  transition-property: transform;
}

.swiper-slide-invisible-blank {
  visibility: hidden;
}

/* Auto Height */
.swiper-container-autoheight,
.swiper-container-autoheight .swiper-slide {
  height: auto;
}
.swiper-container-autoheight .swiper-wrapper {
  align-items: flex-start;
  transition-property: transform, height;
}

/* 3D Effects */
.swiper-container-3d {
  perspective: 1200px;
}
.swiper-container-3d .swiper-wrapper,
.swiper-container-3d .swiper-slide,
.swiper-container-3d .swiper-slide-shadow-left,
.swiper-container-3d .swiper-slide-shadow-right,
.swiper-container-3d .swiper-slide-shadow-top,
.swiper-container-3d .swiper-slide-shadow-bottom,
.swiper-container-3d .swiper-cube-shadow {
  transform-style: preserve-3d;
}
.swiper-container-3d .swiper-slide-shadow-left,
.swiper-container-3d .swiper-slide-shadow-right,
.swiper-container-3d .swiper-slide-shadow-top,
.swiper-container-3d .swiper-slide-shadow-bottom {
  position: absolute;
  left: 0;
  top: 0;
  width: 100%;
  height: 100%;
  pointer-events: none;
  z-index: 10;
}
.swiper-container-3d .swiper-slide-shadow-left {
  background-image: linear-gradient(to left, rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0));
}
.swiper-container-3d .swiper-slide-shadow-right {
  background-image: linear-gradient(to right, rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0));
}
.swiper-container-3d .swiper-slide-shadow-top {
  background-image: linear-gradient(to top, rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0));
}
.swiper-container-3d .swiper-slide-shadow-bottom {
  background-image: linear-gradient(to bottom, rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0));
}

/* CSS Mode */
.swiper-container-css-mode > .swiper-wrapper {
  overflow: auto;
  scrollbar-width: none; /* For Firefox */
  -ms-overflow-style: none; /* For Internet Explorer and Edge */
}
.swiper-container-css-mode > .swiper-wrapper::-webkit-scrollbar {
  display: none;
}
.swiper-container-css-mode > .swiper-wrapper > .swiper-slide {
  scroll-snap-align: start start;
}

.swiper-container-horizontal.swiper-container-css-mode > .swiper-wrapper {
  scroll-snap-type: x mandatory;
}

.swiper-container-vertical.swiper-container-css-mode > .swiper-wrapper {
  scroll-snap-type: y mandatory;
}

:host {
  position: relative;
  z-index: var(--bbva-carousel-default-z-index, 0);
  display: block;
  max-height: 100%;
  box-sizing: border-box;
  transition: height 500ms;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.swiper-container {
  padding: 0.5rem 1rem;
  transition-timing-function: linear;
}
.swiper-container.desktop {
  padding: 0.5rem 3rem;
}
.swiper-container.empty {
  padding: 0;
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

:host::before, :host::after {
  position: absolute;
  z-index: var(--bbva-carousel-asset-gradient-index, 2);
  top: 0;
  display: block;
  width: 1.5rem;
  height: 100%;
  content: "";
}

:host::before {
  left: 0;
  background: linear-gradient(to left, var(--_carousel-default-shadow) 0%, var(--_carousel-default-gradient-color) 100%);
}

:host::after {
  right: 0;
  background: linear-gradient(to right, var(--_carousel-default-shadow) 0%, var(--_carousel-default-gradient-color) 100%);
}

.swiper-wrapper,
.swiper-slide {
  height: auto;
  cursor: pointer;
}
.swiper-wrapper.unclickable,
.swiper-slide.unclickable {
  cursor: auto;
}

.swiper-wrapper {
  width: 100%;
}

.swiper-slide {
  position: relative;
  display: flex;
  overflow: hidden;
  flex-direction: column;
  border-radius: var(--borderRadiusSmall, ${o(l.small)});
  background: var(--_carousel-default-slide-bg-color);
}
.swiper-slide:focus-visible {
  border-radius: 0;
  outline: 0.125rem solid var(--_carousel-default-swiper-container-focus);
  outline-offset: 0.25rem;
}
.swiper-slide.hide {
  opacity: 0;
  transition: opacity 300ms, width 500ms;
}
.swiper-slide .swiper-slide-close {
  z-index: var(--bbva-carousel-button-close-index, 1);
}

.button-container {
  position: absolute;
  top: -2px;
  right: 0;
}
.button-container [data-tag-name=bbva-button-default] {
  justify-content: right;
  padding: 0 0.5rem 0.5rem 0;
}

:host([variant=full-screen]) {
  display: flex;
  flex-direction: column;
  background-color: var(--_carousel-default-slide-bg-color);
}
:host([variant=full-screen])::before, :host([variant=full-screen])::after {
  display: none;
  background: none;
}
:host([variant=full-screen]) .swiper-container::-webkit-scrollbar {
  display: none;
}
:host([variant=full-screen]) .swiper-container {
  width: 100%;
  flex: 1;
  padding: 0.5rem 0;
  -ms-overflow-style: none; /* IE and Edge */
  overflow-y: auto;
  scrollbar-width: none; /* Firefox */
}
:host([variant=full-screen]) .swiper-container.empty {
  padding: 0;
}
:host([variant=full-screen]) .steps.desktop {
  padding: 0;
}

:host([hide-gradient])::before, :host([hide-gradient])::after {
  display: none;
  background: none;
}
:host([hide-gradient]) .swiper-container::-webkit-scrollbar {
  display: none;
}

.steps {
  display: flex;
  justify-content: space-between;
  padding: 0 1rem;
}
.steps .chevrons {
  display: flex;
  gap: 1.5rem;
}
.steps .chevrons [data-tag-name=bbva-button-default] {
  margin: -0.5rem;
}
.steps.desktop {
  padding-right: 2.25rem;
  padding-left: 3rem;
}
.steps.hide {
  opacity: 0;
  transition: opacity 300ms, height 500ms;
}

.swiper-loading {
  display: none;
}

:host([loading-chevrons]) .steps, :host([loading]) .steps {
  justify-content: flex-end;
}
:host([loading-chevrons]) .chevrons, :host([loading]) .chevrons {
  display: none;
}
:host([loading-chevrons]) .chevrons-loading, :host([loading]) .chevrons-loading {
  overflow: hidden;
  width: 5.25rem;
  height: 3rem;
  background-color: var(--_skeleton-default-bg-color);
  -webkit-mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(black 100%, transparent 0);
  mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(black 100%, transparent 0);
  -webkit-mask-position: 0 12px, 48px 12px;
  mask-position: 0 12px, 48px 12px;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: 24px 24px, 24px 24px;
  mask-size: 24px 24px, 24px 24px;
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
:host([loading-chevrons]) .chevrons-loading::after, :host([loading]) .chevrons-loading::after {
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
:host([loading-chevrons]):host([autoplay]) .chevrons-loading, :host([loading]):host([autoplay]) .chevrons-loading {
  width: 8.25rem;
  background-color: var(--_skeleton-default-bg-color);
  -webkit-mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(black 100%, transparent 0), linear-gradient(black 100%, transparent 0);
  mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(black 100%, transparent 0), linear-gradient(black 100%, transparent 0);
  -webkit-mask-position: 0 12px, 48px 12px, 96px 12px;
  mask-position: 0 12px, 48px 12px, 96px 12px;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: 24px 24px, 24px 24px, 24px 24px;
  mask-size: 24px 24px, 24px 24px, 24px 24px;
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
:host([loading-chevrons]):host([autoplay]) .chevrons-loading::after, :host([loading]):host([autoplay]) .chevrons-loading::after {
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
:host([loading-chevrons]):host([full-width]) .swiper-loading, :host([loading]):host([full-width]) .swiper-loading {
  background-color: var(--_skeleton-default-bg-color);
  -webkit-mask-image: linear-gradient(black 100%, transparent 0);
  mask-image: linear-gradient(black 100%, transparent 0);
  -webkit-mask-position: 0 0;
  mask-position: 0 0;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: 100% 100%;
  mask-size: 100% 100%;
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
:host([loading-chevrons]):host([full-width]) .swiper-loading::after, :host([loading]):host([full-width]) .swiper-loading::after {
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

:host([loading]) .swiper-container {
  display: none;
}
:host([loading]) [data-tag-name=bbva-type-text] {
  display: none;
}
:host([loading]) .swiper-loading {
  position: relative;
  display: inline-block;
  overflow: hidden;
  width: 100%;
  height: 9rem;
  background-color: var(--_skeleton-default-bg-color);
  -webkit-mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(black 100%, transparent 0), linear-gradient(black 100%, transparent 0);
  mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(black 100%, transparent 0), linear-gradient(black 100%, transparent 0);
  -webkit-mask-position: 0 0, 50% 0, 100% 0;
  mask-position: 0 0, 50% 0, 100% 0;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: 10% 100%, 75% 100%, 10% 100%;
  mask-size: 10% 100%, 75% 100%, 10% 100%;
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
:host([loading]) .swiper-loading::after {
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
`,N=e`
:host {
  --_carousel-default-slide-bg-color:
    var(--bbva-carousel-default--_ambient--slide-bg-color,
      var(--bbva-carousel-default--custom--primary-ambient--slide-bg-color,
        ${g("colorPrimarySurfaceAlternativeDefault",v)}));
  --_carousel-default-gradient-color:
    var(--bbva-carousel-default--_ambient--gradient-color,
      var(--bbva-carousel-default--custom--primary-ambient--gradient-color,
        ${g("colorPrimaryAltSurfaceAlternativeDefault",v)}));
  --_carousel-default-swiper-container-focus:
    var(--bbva-carousel-default--_ambient--swiper-container-focus,
      var(--bbva-carousel-default--custom--primary-ambient--swiper-container-focus,
        ${g("colorPrimarySurfaceAmbientFocus",v)}));
  --_carousel-default-shadow:
    var(--bbva-carousel-default--_ambient--shadow,
      var(--bbva-carousel-default--custom--primary-ambient--shadow,
        rgba(255, 255, 255, 0)));
}
`;const F=e`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-carousel-default--_ambient--slide-bg-color: initial;
    --bbva-carousel-default--_ambient--gradient-color: initial;
    --bbva-carousel-default--_ambient--swiper-container-focus: initial;
  }
`,Q=e`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-carousel-default--_ambient--slide-bg-color: var(
      --bbva-carousel-default--custom--primary-alt-ambient--slide-bg-color,
      ${g("colorPrimaryAltSurfaceAlternativeDefault",v)}
    );

    --bbva-carousel-default--_ambient--gradient-color: var(
      --bbva-carousel-default--custom--primary-alt-ambient--gradient-color,
      ${g("colorPrimarySurfaceAlternativeDefault",v)}
    );

    --bbva-carousel-default--_ambient--swiper-container-focus: var(
      --bbva-carousel-default--custom--primary-alt-ambient--swiper-container-focus,
      ${g("colorPrimaryAltSurfaceAmbientFocus",v)}
    );
  }
`,R=e`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-carousel-default--_ambient--slide-bg-color: var(
      --bbva-carousel-default--custom--secondary-ambient--slide-bg-color,
      ${g("colorSecondarySurfaceAlternativeDefault",v)}
    );

    --bbva-carousel-default--_ambient--gradient-color: var(
      --bbva-carousel-default--custom--secondary-ambient--gradient-color,
      ${g("colorSecondaryAltSurfaceAlternativeDefault",v)}
    );

    --bbva-carousel-default--_ambient--swiper-container-focus: var(
      --bbva-carousel-default--custom--secondary-ambient--swiper-container-focus,
      ${g("colorSecondarySurfaceAmbientFocus",v)}
    );
  }
`,O=e`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-carousel-default--_ambient--slide-bg-color: var(
      --bbva-carousel-default--custom--secondary-alt-ambient--slide-bg-color,
      ${g("colorSecondaryAltSurfaceAlternativeDefault",v)}
    );

    --bbva-carousel-default--_ambient--gradient-color: var(
      --bbva-carousel-default--custom--secondary-alt-ambient--gradient-color,
      ${g("colorSecondarySurfaceAlternativeDefault",v)}
    );

    --bbva-carousel-default--_ambient--swiper-container-focus: var(
      --bbva-carousel-default--custom--secondary-alt-ambient--swiper-container-focus,
      ${g("colorSecondaryAltSurfaceAmbientFocus",v)}
    );
  }
`;const V=A([Object.freeze({__proto__:null,primary:F,primaryAlt:Q,secondary:R,secondaryAlt:O}),j,_]),W=Object.values(V);k.use([$,P]);class Z extends(y(t(x(B(i))))){static get scopedElements(){return{"bbva-step-bar":T,"bbva-button-default":S}}static get is(){return"bbva-carousel-default"}static get properties(){return{items:{type:Array},selected:{type:Number},swiperConfig:{type:Object},variant:{type:String},scopedComponents:{type:Array,attribute:"scoped-components"},type:{type:String},_sliderContainer:{type:Object},_leftGradient:{type:Object},_rightGradient:{type:Object},scrollPosition:{type:Number},columns:{type:Number},closeItem:{type:Boolean,attribute:"close-item"},loop:{type:Boolean,reflect:!0},stepLength:{type:Number,attribute:"step-length"},_ariaLive:{type:Boolean,state:!0},_showMessageSlideDeleted:{type:Boolean},_slideDeleted:{type:Number},_lastSlideClickTime:{type:String},hideGradient:{type:Boolean,attribute:"hide-gradient",reflect:!0},loading:{type:Boolean,reflect:!0},loadingChevrons:{type:Boolean,attribute:"loading-chevrons",reflect:!0},iconBack:{type:String},iconClose:{type:String},iconNext:{type:String},fullWidth:{type:Boolean,attribute:"full-width"},autoplay:{type:Boolean,reflect:!0},isPlaying:{type:Boolean},isList:{type:Boolean},_desktop:{type:Boolean,attribute:!1},autoplayDelay:{type:Number,attribute:"autoplay-delay"},_hasImage:{type:Boolean},_itemsWithVisibilityState:{type:Array},visibilityThreshold:{type:Number,attribute:"visibility-threshold"},accessibilityHeadingText:{type:String,attribute:"accessibility-heading-text"},carouselAccessibilityText:{type:String,attribute:"carousel-accessibility-text"},slideCloseAccessibilityText:{type:String,attribute:"slide-close-accessibility-text"},prevChevronAccessibilityText:{type:String,attribute:"prev-chevron-accessibility-text"},nextChevronAccessibilityText:{type:String,attribute:"next-chevron-accessibility-text"},_touchStarted:{type:Boolean,state:!0},showPlay:{type:Boolean,attribute:"show-play"}}}constructor(){super(),this._closeClicked=!1,this.items=[],this.selected=0,this.swiperConfig={},this.variant="",this.type="scroll",this.scrollPosition=0,this.columns=1,this.closeItem=!1,this.loop=!1,this.iconBack=n(),this.iconClose=c(),this.iconNext=d(),this.keepSlideOnInit=!1,this.stepLength=0,this._ariaLive=!1,this.hideGradient=!1,this.loading=!1,this.loadingChevrons=!1,this.fullWidth=!1,this.autoplay=!1,this.isPlaying=!1,this.isList=!1,this._showMessageSlideDeleted=!1,this._desktop=!1,this.autoplayDelay=3e3,this._hasImage=!1,this._itemsWithVisibilityState=[],this.visibilityThreshold=.5,this._itemsVisibilityChange=this._itemsVisibilityChange.bind(this),this.accessibilityHeadingText="bbva-carousel-default-carousel-aria-label",this.carouselAccessibilityText="bbva-carousel-default-carousel-sr-description",this.slideCloseAccessibilityText="bbva-carousel-default-slide-close",this.prevChevronAccessibilityText="bbva-carousel-default-chevron-prev-aria-label",this.nextChevronAccessibilityText="bbva-carousel-default-chevron-next-aria-label",this._lastSlideClickTime=new Date,this._touchStarted=!1,this.showPlay=!1,this._shouldUpdateSwiper=!1}static get styles(){return[N,M,W,a("bbva-carousel-default-shared-styles")]}update(e){var t;if(super.update(e),this._sliderContainer=this._sliderContainer||this.shadowRoot.querySelector(".swiper-container"),e.has("scopedComponents")&&this.scopedComponents&&this.scopedComponents.forEach((e=>{this.defineScopedElement(e.tagName,e.class)})),(e.has("loading")||e.has("loadingChevrons")||e.has("items"))&&null!==(t=this.items)&&void 0!==t&&t.length&&!this._loading){this.stepLength=this.items.length;(this.items[0].content instanceof p?this.items[0].content.strings[0]:this.items[0].content).includes("img")&&(this._hasImage=!0,this._sliderContainer.classList.add("image"))}e.has("autoplay")&&(this.isPlaying=this.autoplay)}get _loading(){return this.loading||this.loadingChevrons}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)"}}initializeSwiper(){this._swiper&&this._swiper.destroy(),this._swiper=new k(this._sliderContainer,this.configSwiper()),this._swiper.on("init",(()=>{this.requestUpdate(),this.updateComplete.then((()=>{this._updateSlideAccessibility()}))})),this._swiper.init(),this._swiper.on("slideChange",(()=>{var e;"swipe"===this.type&&(null===(e=this._swiper.slides[this._swiper.previousIndex])||void 0===e||e.setAttribute("aria-hidden",!0),this._select(this._swiper.realIndex));requestAnimationFrame((()=>{this._updateSlideAccessibility()}))})),this.loop&&this._swiper.on("slideChangeTransitionEnd",(()=>{this._swiper.loopFix()})),this.selected=this._setIndex()}_setIndex(){return this.selected||0}_fullWidth(){return this._desktop?this.fullWidth?0:32:this.fullWidth?0:8}configSwiper(){return{...{init:!1,loop:this.loop,freeMode:"scroll"===this.type,enabled:!(1===this.items.length),slidesPerView:this.getSlidesPerView(),spaceBetween:this._fullWidth(),speed:500,keyboard:{enabled:!0},initialSlide:this._setIndex(),loopAdditionalSlides:1,...this.autoplay&&{autoplay:{delay:this.autoplayDelay,disableOnInteraction:!1}},on:{touchStart:()=>{this._touchStarted=!0},touchEnd:()=>{this._touchStarted=!1,this._lastSlideClickTime=Date.now()}}},...this.swiperConfig}}getSlidesPerView(){const e=+({swipe:{"two-columns":1.999,"three-columns":2.999,"four-columns":3.999,"five-columns":4.999,default:1},scroll:{"two-columns":1.409,"three-columns":2.351,"four-columns":3.3,"five-columns":4.15}}[this.type][this.variant]||"1");return this.columns=1===e?e:Math.floor(e+1),e}updated(e){super.updated(e),(e.has("loop")||e.has("items")||e.has("swiperConfig")||e.has("_desktop")||e.has("_hasImage")||e.has("_intlLanguage")||e.has("_intlResources")||e.has("loading")||e.has("autoplay"))&&(1===this.items.length&&this.loop&&(this.loop=!1),this.isPlaying=this.autoplay,this.initializeSwiper()),e.has("items")&&this._initIntersectionObserverControllers()}_select(e){if(this.selected===e)return;const t=this.selected;this.selected=e,this.isPlaying||(this._ariaLive=!0),this.loop||this.autoplay||0===e?this.scrollPosition=20*e:this.items.length>3&&e+1<this.items.length&&e>0&&(this.scrollPosition=20*(e-1));const i=this.items.length,a=(e-t+i)%i;let s;if(s=0===a?null:a<=i/2?"next":"prev",this.loop){const e=this.shadowRoot.querySelector('[data-tag-name="bbva-step-bar"]');"prev"===s?e._onNextSlide():"next"===s&&e._onPrevSlide()}this.dispatchEvent(new CustomEvent("carousel-default-item-select",{detail:this.selected,bubbles:!0,composed:!0}))}_tap(e){var t,i;const a=this._getAdjustedIndex(e)-1;!(null!==(t=this._swiper)&&void 0!==t&&null!==(i=t.slides[a])&&void 0!==i&&i.classList.contains("unclickable"))&&this.dispatchEvent(new CustomEvent("carousel-default-item-tap",{detail:e,bubbles:!0,composed:!0}))}_updateSlideAccessibility(){const e=this._swiper.slides.slice(this._swiper.activeIndex,this._swiper.activeIndex+Math.min(this._swiper.slidesPerViewDynamic(),this.items.length));this._swiper.slides.forEach((t=>{const i=!e.includes(t),a=t.querySelectorAll(`a, button, input, ${["button","link","checkbox","radio","tab","menuitem"].map((e=>`[role="${e}"]`)).join(", ")}`),s=!!Array.from(a).filter((e=>!e.classList.contains("swiper-slide-close")&&"none"!==e.style.display)).length;i&&"swipe"===this.type?(t.setAttribute("aria-hidden",i),t.setAttribute("tabindex",-1)):(t.removeAttribute("aria-hidden"),t.removeAttribute("tabindex")),s?(t.classList.add("unclickable"),t.removeAttribute("tabindex")):t.classList.remove("unclickable");const r=(e,t)=>{t&&"swipe"===this.type?e.setAttribute("disabled",""):e.removeAttribute("disabled")};r(t,i);const o=t.querySelector(".swiper-slide-close");o&&r(o,i),i&&"swipe"===this.type?a.forEach((e=>{e.setAttribute("tabindex","-1")})):a.forEach((e=>{e.setAttribute("tabindex","0")}))}))}_close(e,t){if(e.stopPropagation(),!this._closeClicked){this._closeClicked=!0;const e=this.shadowRoot.querySelector(`.swiper-slide:nth-child(${this._getAdjustedIndex(t)})`),i=this.shadowRoot.querySelector(".steps");this.dispatchEvent(new CustomEvent("carousel-default-item-close",{detail:t,bubbles:!0,composed:!0})),this._showMessageSlideDeleted=!0,this._slideDeleted=t,1===this.items.length&&(this.style.height=`${this.clientHeight}px`,i.classList.add("hide")),e.classList.add("hide"),setTimeout((()=>{this._updateItem(t,e,i),this._showMessageSlideDeleted=!1,this._closeClicked=!1}),500)}}_updateItem(e,t,i){t.style.width=0,t.style.marginRight=0,t.style.height=0,1===this.items.length?(i.style.height=0,this.style.height=0,this._deleteItem(e,t)):setTimeout((()=>{this._deleteItem(e,t)}),500)}_deleteItem(e,t){const i=this.selected===this.items.length-(this.loop?1:this.columns);t.classList.remove("hide"),i&&(this.loop?(this.scrollPosition=0,this.selected=0):(this.scrollPosition=20*this.selected,this.selected-=1)),this.items=[...this.items.slice(0,e),...this.items.slice(e+1,this.items.length)],1===this.items.length&&(this.loop=!1),this.autoplay&&setTimeout((()=>{this._keepAutoplay()}),100),this.dispatchEvent(new CustomEvent("bbva-carousel-default-item-finish-delete",{detail:e,bubbles:!0,composed:!0}))}_keepAutoplay(){this.isPlaying?this._swiper.autoplay.start():this._swiper.autoplay.stop()}_getAdjustedIndex(e){return this.loop?e+this._swiper.loopedSlides+1:e+1}_buttonClose(e,t){return t||this.closeItem?s`
        <div class="button-container" ambient="${this._hasImage?"secondary":""}">
          <bbva-button-default
            tabindex="${this._isDisabled(e)?-1:0}"
            aria-label="${this.t(this.slideCloseAccessibilityText)}"
            class="swiper-slide-close"
            icon="${this.iconClose}"
            icon-size="16"
            variant="icon no-background alternative"
            ?disabled=${this._isDisabled(e)}
            @click=${t=>this._close(t,e)}
          >
          </bbva-button-default>
        </div>
      `:s``}get _navigationChevronsTpl(){return s`
      <div class="chevrons">
        ${this.showPlay?this._playButton:""}

        <bbva-button-default
          class="chevron-button chevron-prev"
          aria-label="${this.t(this.prevChevronAccessibilityText)}"
          aria-controls="carouselSlides"
          variant="icon no-background"
          icon="${this.iconBack}"
          ?disabled="${!this.loop&&this.selected<=0}"
          aria-disabled="${this.disabled}"
          ?loading="${this._loading}"
          @click="${this._onChevronPrevClick}"
        >
        </bbva-button-default>

        <bbva-button-default
          class="chevron-button chevron-next"
          aria-label="${this.t(this.nextChevronAccessibilityText)}"
          aria-controls="carouselSlides"
          variant="icon no-background"
          icon="${this.iconNext}"
          ?disabled="${!this.loop&&this.selected===this.stepLength-this.columns}"
          aria-disabled="${this.disabled}"
          ?loading="${this._loading}"
          @click="${this._onChevronNextClick}"
        >
        </bbva-button-default>
      </div>
    `}_onChevronPrevClick(){this._lastSlideClickTime=Date.now(),this._swiper.slidePrev()}_togglePlay(){this.disabled||(this._ariaLive=!1,this.isPlaying=!this.isPlaying,this.isPlaying?this._swiper.autoplay.start():(this._swiper.autoplay.stop(),this.autoplay=!1))}_onChevronNextClick(){this._lastSlideClickTime=Date.now(),this._swiper.slideNext()}get _playButton(){return this.items.length>this.columns?s`
          <bbva-button-default
            class="play-button"
            aria-label="${this.t(this.isPlaying?"bbva-carousel-default-automatic-pause":"bbva-carousel-default-automatic-play")}"
            variant="icon no-background"
            icon="${this.isPlaying?h():b()}"
            @click="${this._togglePlay}"
            aria-disabled=${this.disabled}
          >
          </bbva-button-default>
        `:""}_isDisabled(e){return"swipe"===this.type&&this._swiper&&this._swiper.slides.length>0&&(e+1>this._swiper.slidesPerViewDynamic()+this._swiper.activeIndex||e+1<=this._swiper.activeIndex)}get _tpl(){return s`
      <div
        role="region"
        aria-labelledby="cards-heading"
        aria-describedby="description-carousel"
        aria-live="${this._ariaLive&&"swipe"===this.type?"polite":"off"}"
        class="swiper-container ${this._desktop?"desktop":""} ${0===this.items.length?"empty":""}"
        id="${this.id}"
      >
        <p id="cards-heading" class="sr-only">
          ${this.t(this.accessibilityHeadingText)}
        </p>
        <p id="description-carousel" class="sr-only">${this.t(this.carouselAccessibilityText)}</p>
        <div
          id="carouselSlides"
          class="swiper-wrapper"
          role="${u(this.isList&&"scroll"===this.type?"list":void 0)}"
        >
          ${"swipe"===this.type?this.items.map(((e,t)=>this._swipeTpl(e,t))):this.items.map(((e,t)=>this._scrollTpl(e,t)))}
        </div>
      </div>
      <div class="gradient bottom"></div>
      <div class="swiper-loading"></div>

      ${this.items&&this.items.length>0&&"swipe"===this.type?s`<div class="steps ${this._desktop?"desktop":""}">
            ${this._stepBar} ${this._navigationChevronsTpl}
          </div>`:s``}

      <div class="steps">
        <div class="chevrons-loading"></div>
      </div>
      <span class="sr-only" aria-live="polite">
        ${this._showMessageSlideDeleted?this.t("bbva-carousel-default-slide-deleted",{slide:this._slideDeleted+1}):""}
      </span>
    `}_scrollTpl(e,t){return s`
      <div
        role="${u(this.isList&&"scroll"===this.type?"listitem":void 0)}"
        ambient="${(null==e?void 0:e.ambient)||""}"
        @click=${()=>this._tap(t)}
        @keypress="${()=>this._tap(t)}"
        class="swiper-slide"
      >
        ${this._buttonClose(t,null==e?void 0:e.closeItem)}
        ${e.content instanceof p?e.content:m(e.content)}
      </div>
    `}_swipeTpl(e,t){return s`
      <div
        ambient="${(null==e?void 0:e.ambient)||""}"
        tabindex="${u(this._isDisabled(t)?-1:void 0)}"
        @click=${()=>this._tap(t)}
        @keypress="${()=>this._tap(t)}"
        class="swiper-slide"
        role="group"
        aria-hidden="${u(this._isDisabled(t)?"true":void 0)}"
        aria-labelledby="slide-${t}"
      >
        <p id="slide-${t}" class="sr-only">
          ${this.t("bbva-carousel-default-slide-aria-label",{slide:t+1,totalSlides:this.items&&this.items.length})}
        </p>
        ${this._buttonClose(t,null==e?void 0:e.closeItem)}
        ${e.content instanceof p?e.content:m(e.content)}
      </div>
    `}get _stepBar(){return this._loading?"":s`
          <bbva-step-bar
            aria-hidden="true"
            .items="${this.items.length+(this.loop?0:1-this.columns)}"
            .selected="${this.selected}"
            scroll-position="${this.scrollPosition}"
            .columns="${this.columns}"
            tabindex="-1"
            ?full-screen="${"full-screen"===this.variant}"
            .loop="${this.loop}"
          >
          </bbva-step-bar>
        `}_initIntersectionObserverControllers(){var e;const t=Array.from(this.shadowRoot.querySelectorAll(".swiper-slide"));null===(e=this._boxesIntersectionObserver)||void 0===e||e.disconnect(),this._itemsWithVisibilityState=t.map(((e,t)=>({id:`swiper-item-${t}`,target:e,visible:null}))),this._boxesIntersectionObserver=new C(this,{target:t,config:{threshold:this.visibilityThreshold,delay:300},callback:this._itemsVisibilityChange,skipInitial:!1})}_updateSwiperItems(e){this._shouldUpdateSwiper&&(this._shouldUpdateSwiper=!1,this._swiper.update()),0===e.length&&0===this._swiper.slides.length&&(this._shouldUpdateSwiper=!0)}_itemsVisibilityChange(e){for(const t of e){const e=this._itemsWithVisibilityState.find((e=>e.target===t.target));e&&e.visible!==t.isIntersecting&&(e.visible=t.isIntersecting)}const t=Date.now()-this._lastSlideClickTime<this.autoplayDelay||this._touchStarted,i=this._itemsWithVisibilityState.filter((e=>e.visible));this._updateSwiperItems(i),this.dispatchEvent(new CustomEvent("carousel-default-item-visibility-change",{composed:!0,bubbles:!0,detail:{visible:i,all:this._itemsWithVisibilityState,manualTransition:t}}))}render(){return s`${this._tpl}`}}export{Z as B,T as a,V as b};
