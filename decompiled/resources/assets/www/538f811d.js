import{z as t,an as e,L as i,ak as a,h as s,a8 as r,be as o,cv as n,bF as l,cw as c,cx as d,i as u,cy as b,cz as p,aO as h,ck as m,W as g,dW as y,dX as v}from"./952f98a9.js";import{R as f,S as A,D as _,v as w,G as k,V as x,ai as $,W as S,f as C,M as q,L as E,K as P,H as B,x as D,aa as T,N as F,z as R,T as I,ar as Y,a4 as N,Q as O,a3 as z}from"./216055dc.js";import"./b87bf4dd.js";import{B as M}from"./d9e9a750.js";import{B as L}from"./f841c773.js";import{B as j}from"./c0a2f832.js";import{B as G,a as H}from"./be12d7a2.js";import{A as Q,K as V}from"./72e6e777.js";import{s as U}from"./8dab2181.js";var W=t`
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
  transition: all 0.3s ease-in-out 0.1s;
}
.stepbar .bar:first-of-type {
  margin-left: 0;
}
.stepbar .bar.selected {
  width: 2rem;
  border: 0.0625rem solid var(--_carousel-default-step-bar-border-color-active);
  transition: all 0.3s ease-in-out 0.1s;
}
.stepbar.minimum {
  min-width: auto;
  grid-template-columns: auto;
}
.stepbar.minimum .bar {
  transition: none;
}
.stepbar.minimum .bar.selected {
  transition: none;
}

:host [data-tag-name=bbva-type-text] {
  margin-left: 0.5rem;
  color: var(--_carousel-default-step-bar-border-color-active);
}

:host([full-screen]) .stepbar .bar:not(.selected) {
  border: 0.0625rem solid var(--_carousel-default-step-bar-border-color-alternative);
}
`,Z=t`
:host {
  --_carousel-default-step-bar-border-color:
    var(--bbva-carousel-default-step-bar--_ambient--border-color,
      var(--bbva-carousel-default-step-bar--custom--primary-ambient--border-color,
        ${f("colorPrimarySurfaceAmbientPreloading",A)}));
  --_carousel-default-step-bar-border-color-active:
    var(--bbva-carousel-default-step-bar--_ambient--border-color-active,
      var(--bbva-carousel-default-step-bar--custom--primary-ambient--border-color-active,
        ${f("colorPrimarySelectionInteraction01BackgroundSelected",A)}));
  --_carousel-default-step-bar-border-color-alternative:
    var(--bbva-carousel-default-step-bar--_ambient--border-color-alternative,
      var(--bbva-carousel-default-step-bar--custom--primary-ambient--border-color-alternative,
        ${f("colorPrimarySurfaceAmbientDefault",A)}));
}
`;const X=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-carousel-default-step-bar--_ambient--border-color: initial;
    --bbva-carousel-default-step-bar--_ambient--border-color-active: initial;
    --bbva-carousel-default-step-bar--_ambient--border-color-alternative: initial;
  }
`,K=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-carousel-default-step-bar--_ambient--border-color: var(
      --bbva-carousel-default-step-bar--custom--primary-alt-ambient--border-color,
      ${f("colorPrimaryAltSurfaceAmbientPreloading",A)}
    );

    --bbva-carousel-default-step-bar--_ambient--border-color-active: var(
      --bbva-carousel-default-step-bar--custom--primary-alt-ambient--border-color-active,
      ${f("colorPrimaryAltSelectionInteraction01BackgroundSelected",A)}
    );

    --bbva-carousel-default-step-bar--_ambient--border-color-alternative: var(
      --bbva-carousel-default-step-bar--custom--primary-alt-ambient--border-color-alternative,
      ${f("colorPrimaryAltSurfaceAmbientDefault",A)}
    );
  }
`,J=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-carousel-default-step-bar--_ambient--border-color: var(
      --bbva-carousel-default-step-bar--custom--secondary-ambient--border-color,
      ${f("colorSecondarySurfaceAmbientPreloading",A)}
    );

    --bbva-carousel-default-step-bar--_ambient--border-color-active: var(
      --bbva-carousel-default-step-bar--custom--secondary-ambient--border-color-active,
      ${f("colorSecondarySelectionInteraction01BackgroundSelected",A)}
    );

    --bbva-carousel-default-step-bar--_ambient--border-color-alternative: var(
      --bbva-carousel-default-step-bar--custom--secondary-ambient--border-color-alternative,
      ${f("colorSecondarySurfaceAmbientDefault",A)}
    );
  }
`,tt=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-carousel-default-step-bar--_ambient--border-color: var(
      --bbva-carousel-default-step-bar--custom--secondary-alt-ambient--border-color,
      ${f("colorSecondaryAltSurfaceAmbientPreloading",A)}
    );

    --bbva-carousel-default-step-bar--_ambient--border-color-active: var(
      --bbva-carousel-default-step-bar--custom--secondary-alt-ambient--border-color-active,
      ${f("colorSecondaryAltSelectionInteraction01BackgroundSelected",A)}
    );

    --bbva-carousel-default-step-bar--_ambient--border-color-alternative: var(
      --bbva-carousel-default-step-bar--custom--secondary-alt-ambient--border-color-alternative,
      ${f("colorSecondaryAltSurfaceAmbientDefault",A)}
    );
  }
`,et={primary:t`
    ${X} ${_.primary}
  `,primaryAlt:t`
    ${K} ${_.primaryAlt}
  `,secondary:t`
    ${J} ${_.secondary}
  `,secondaryAlt:t`
    ${tt} ${_.secondaryAlt}
  `},it=Object.values(et);class at extends(e(w(i))){static get is(){return"bbva-step-bar"}static get scopedElements(){return{"bbva-type-text":k}}static get properties(){return{iconSelected:{type:Boolean,attribute:"icon-selected",reflected:!0},items:{type:Number},selected:{type:Number},scrollPosition:{type:Number,attribute:"scroll-position"},columns:{type:Number},fullScreen:{type:Boolean,attribute:"full-screen",reflect:!0},loop:{type:Boolean,reflect:!0}}}constructor(){super(),this.selected=0,this.canAdd=!1,this.iconSelected=!1,this.scrollPosition=0,this.columns=1,this.fullScreen=!1,this.loop=!1}updated(t){super.updated(t),t.has("scrollPosition")&&this._smoothScrollToPosition(300)}static _easeInOutQuad(t){return t<.5?2*t*t:1-(-2*t+2)**2/2}_smoothScrollToPosition(t=1e3){const e=this._stpBarCtn.scrollLeft,i=this.scrollPosition-e;let a;const s=r=>{a||(a=r);const o=r-a,n=Math.min(o/t,1);this._stpBarCtn.scrollLeft=e+i*at._easeInOutQuad(n),n<1&&requestAnimationFrame(s)};requestAnimationFrame(s)}get _stpBarCtn(){return this._stepbar||(this._stepbar=this.shadowRoot.querySelector(".stepbar")),this._stepbar}get _items(){const t=this.items>0?this.items:1,e=this.loop?this.items+2:t;return Array(e).fill(void 0)}static get styles(){return[Z,W,it,a("bbva-step-bar-shared-styles")]}_minMaxValues(){const t=this.selected<0?1:this.selected+1,e=this.items<1?1:this.items;return this.t("bbva-carousel-default-value-min-max",{slide:t,totalSlides:e})}get _stepBar(){return s`
      <div class="stepbar ${this.items<3?"minimum":""}" .scrollLeft="${this.scrollPosition}">
        ${this._items.map(((t,e)=>{const i=(this.selected===e||this.selected<0)&&!this.loop||this.loop&&e===this.selected+1;return s`<div class="bar ${i?"selected":""}"></div>`}))}
      </div>
      <bbva-type-text
        tag="span"
        font-style="italic"
        size="2XS"
        .text="${this._minMaxValues()}"
      ></bbva-type-text>
    `}render(){return s` ${this._stepBar} `}}var st=t`
@font-face {
  font-family: "swiper-icons";
  src: url("data:application/font-woff;charset=utf-8;base64, d09GRgABAAAAAAZgABAAAAAADAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABGRlRNAAAGRAAAABoAAAAci6qHkUdERUYAAAWgAAAAIwAAACQAYABXR1BPUwAABhQAAAAuAAAANuAY7+xHU1VCAAAFxAAAAFAAAABm2fPczU9TLzIAAAHcAAAASgAAAGBP9V5RY21hcAAAAkQAAACIAAABYt6F0cBjdnQgAAACzAAAAAQAAAAEABEBRGdhc3AAAAWYAAAACAAAAAj//wADZ2x5ZgAAAywAAADMAAAD2MHtryVoZWFkAAABbAAAADAAAAA2E2+eoWhoZWEAAAGcAAAAHwAAACQC9gDzaG10eAAAAigAAAAZAAAArgJkABFsb2NhAAAC0AAAAFoAAABaFQAUGG1heHAAAAG8AAAAHwAAACAAcABAbmFtZQAAA/gAAAE5AAACXvFdBwlwb3N0AAAFNAAAAGIAAACE5s74hXjaY2BkYGAAYpf5Hu/j+W2+MnAzMYDAzaX6QjD6/4//Bxj5GA8AuRwMYGkAPywL13jaY2BkYGA88P8Agx4j+/8fQDYfA1AEBWgDAIB2BOoAeNpjYGRgYNBh4GdgYgABEMnIABJzYNADCQAACWgAsQB42mNgYfzCOIGBlYGB0YcxjYGBwR1Kf2WQZGhhYGBiYGVmgAFGBiQQkOaawtDAoMBQxXjg/wEGPcYDDA4wNUA2CCgwsAAAO4EL6gAAeNpj2M0gyAACqxgGNWBkZ2D4/wMA+xkDdgAAAHjaY2BgYGaAYBkGRgYQiAHyGMF8FgYHIM3DwMHABGQrMOgyWDLEM1T9/w8UBfEMgLzE////P/5//f/V/xv+r4eaAAeMbAxwIUYmIMHEgKYAYjUcsDAwsLKxc3BycfPw8jEQA/gZBASFhEVExcQlJKWkZWTl5BUUlZRVVNXUNTQZBgMAAMR+E+gAEQFEAAAAKgAqACoANAA+AEgAUgBcAGYAcAB6AIQAjgCYAKIArAC2AMAAygDUAN4A6ADyAPwBBgEQARoBJAEuATgBQgFMAVYBYAFqAXQBfgGIAZIBnAGmAbIBzgHsAAB42u2NMQ6CUAyGW568x9AneYYgm4MJbhKFaExIOAVX8ApewSt4Bic4AfeAid3VOBixDxfPYEza5O+Xfi04YADggiUIULCuEJK8VhO4bSvpdnktHI5QCYtdi2sl8ZnXaHlqUrNKzdKcT8cjlq+rwZSvIVczNiezsfnP/uznmfPFBNODM2K7MTQ45YEAZqGP81AmGGcF3iPqOop0r1SPTaTbVkfUe4HXj97wYE+yNwWYxwWu4v1ugWHgo3S1XdZEVqWM7ET0cfnLGxWfkgR42o2PvWrDMBSFj/IHLaF0zKjRgdiVMwScNRAoWUoH78Y2icB/yIY09An6AH2Bdu/UB+yxopYshQiEvnvu0dURgDt8QeC8PDw7Fpji3fEA4z/PEJ6YOB5hKh4dj3EvXhxPqH/SKUY3rJ7srZ4FZnh1PMAtPhwP6fl2PMJMPDgeQ4rY8YT6Gzao0eAEA409DuggmTnFnOcSCiEiLMgxCiTI6Cq5DZUd3Qmp10vO0LaLTd2cjN4fOumlc7lUYbSQcZFkutRG7g6JKZKy0RmdLY680CDnEJ+UMkpFFe1RN7nxdVpXrC4aTtnaurOnYercZg2YVmLN/d/gczfEimrE/fs/bOuq29Zmn8tloORaXgZgGa78yO9/cnXm2BpaGvq25Dv9S4E9+5SIc9PqupJKhYFSSl47+Qcr1mYNAAAAeNptw0cKwkAAAMDZJA8Q7OUJvkLsPfZ6zFVERPy8qHh2YER+3i/BP83vIBLLySsoKimrqKqpa2hp6+jq6RsYGhmbmJqZSy0sraxtbO3sHRydnEMU4uR6yx7JJXveP7WrDycAAAAAAAH//wACeNpjYGRgYOABYhkgZgJCZgZNBkYGLQZtIJsFLMYAAAw3ALgAeNolizEKgDAQBCchRbC2sFER0YD6qVQiBCv/H9ezGI6Z5XBAw8CBK/m5iQQVauVbXLnOrMZv2oLdKFa8Pjuru2hJzGabmOSLzNMzvutpB3N42mNgZGBg4GKQYzBhYMxJLMlj4GBgAYow/P/PAJJhLM6sSoWKfWCAAwDAjgbRAAB42mNgYGBkAIIbCZo5IPrmUn0hGA0AO8EFTQAA") format("woff");
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

.swiper-container::before, .swiper-container::after {
  position: absolute;
  z-index: var(--bbva-carousel-asset-gradient-index, 2);
  top: 0;
  display: block;
  width: 1.5rem;
  height: 100%;
  content: "";
}

.swiper-container::before {
  left: 0;
  background: linear-gradient(to left, transparent 0%, var(--_carousel-default-gradient-color) 100%);
}

.swiper-container::after {
  right: 0;
  background: linear-gradient(to right, transparent 0%, var(--_carousel-default-gradient-color) 100%);
}

.swiper-wrapper,
.swiper-slide {
  height: auto;
  cursor: pointer;
}

.swiper-wrapper {
  width: 100%;
}

.swiper-slide {
  position: relative;
  display: flex;
  overflow: hidden;
  flex-direction: column;
  border-radius: var(--borderRadiusSmall, ${r(o.small)});
  background: var(--_carousel-default-slide-bg-color);
}
.swiper-slide:focus-visible {
  border-radius: 0;
  outline: 0.125rem solid var(--_carousel-default-swiper-container-focus);
  outline-offset: 0.25rem;
}
.swiper-slide.hide {
  opacity: 0;
  transition: opacity 500ms, width 500ms;
}

.button-container {
  position: absolute;
  right: 0;
}

:host([variant=full-screen]) {
  display: flex;
  flex-direction: column;
  background-color: var(--_carousel-default-slide-bg-color);
}
:host([variant=full-screen]) .swiper-container::before, :host([variant=full-screen]) .swiper-container::after {
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

:host([hide-gradient]) .swiper-container::before, :host([hide-gradient]) .swiper-container::after {
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
  position: relative;
  display: inline-block;
  overflow: hidden;
  width: 5.25rem;
  height: 3rem;
  background-repeat: no-repeat;
  opacity: 1;
  pointer-events: none;
  background-image: linear-gradient(var(--_carousel-default-skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_carousel-default-skeleton-quote-color) 100%, transparent 0);
  background-color: transparent;
  background-size: 24px 24px, 24px 24px;
  background-position: 0 12px, 48px 12px;
}
:host([loading-chevrons]) .chevrons-loading .skeleton, :host([loading]) .chevrons-loading .skeleton {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  width: 100%;
  height: 3rem;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background: var(--_carousel-default-skeleton-animated-layer-bg);
  contain: strict;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
}
:host([loading-chevrons]):host([autoplay]) .chevrons-loading, :host([loading]):host([autoplay]) .chevrons-loading {
  width: 8.25rem;
  background-image: linear-gradient(var(--_carousel-default-skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_carousel-default-skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_carousel-default-skeleton-quote-color) 100%, transparent 0);
  background-color: transparent;
  background-size: 24px 24px, 24px 24px, 24px 24px;
  background-position: 0 12px, 48px 12px, 96px 12px;
}
:host([loading-chevrons]):host([full-width]) .swiper-loading, :host([loading]):host([full-width]) .swiper-loading {
  background-image: linear-gradient(var(--_carousel-default-skeleton-quote-color) 100%, transparent 0);
  background-color: transparent;
  background-size: 100% 100%;
  background-position: 0 0;
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
  background-repeat: no-repeat;
  opacity: 1;
  pointer-events: none;
  background-image: linear-gradient(var(--_carousel-default-skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_carousel-default-skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_carousel-default-skeleton-quote-color) 100%, transparent 0);
  background-color: transparent;
  background-size: 10% 100%, 75% 100%, 10% 100%;
  background-position: 0 0, 50% 0, 100% 0;
}
:host([loading]) .swiper-loading .skeleton {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  width: 100%;
  height: 9rem;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background: var(--_carousel-default-skeleton-animated-layer-bg);
  contain: strict;
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
`,rt=t`
:host {
  --_carousel-default-slide-bg-color:
    var(--bbva-carousel-default--_ambient--slide-bg-color,
      var(--bbva-carousel-default--custom--primary-ambient--slide-bg-color,
        ${f("colorPrimarySurfaceAlternativeDefault",A)}));
  --_carousel-default-gradient-color:
    var(--bbva-carousel-default--_ambient--gradient-color,
      var(--bbva-carousel-default--custom--primary-ambient--gradient-color,
        ${f("colorPrimaryAltSurfaceAlternativeDefault",A)}));
  --_carousel-default-skeleton-quote-color:
    var(--bbva-carousel-default--_ambient--skeleton-quote-color,
      var(--bbva-carousel-default--custom--primary-ambient--skeleton-quote-color,
        ${f("colorPrimarySurfaceAmbientPreloading",A)}));
  --_carousel-default-skeleton-animated-layer-bg:
    var(--bbva-carousel-default--_ambient--skeleton-animated-layer-bg,
      var(--bbva-carousel-default--custom--primary-ambient--skeleton-animated-layer-bg,
        ${f("colorPrimarySurfaceAmbientDefault",A)}));
  --_carousel-default-swiper-container-focus:
    var(--bbva-carousel-default--_ambient--swiper-container-focus,
      var(--bbva-carousel-default--custom--primary-ambient--swiper-container-focus,
        ${f("colorPrimarySurfaceAmbientFocus",A)}));
}
`;const ot=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-carousel-default--_ambient--slide-bg-color: initial;
    --bbva-carousel-default--_ambient--gradient-color: initial;
    --bbva-carousel-default--_ambient--skeleton-quote-color: initial;
    --bbva-carousel-default--_ambient--skeleton-animated-layer-bg: initial;
    --bbva-carousel-default--_ambient--swiper-container-focus: initial;
  }
`,nt=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-carousel-default--_ambient--slide-bg-color: var(
      --bbva-carousel-default--custom--primary-alt-ambient--slide-bg-color,
      ${f("colorPrimaryAltSurfaceAlternativeDefault",A)}
    );

    --bbva-carousel-default--_ambient--gradient-color: var(
      --bbva-carousel-default--custom--primary-alt-ambient--gradient-color,
      ${f("colorPrimarySurfaceAlternativeDefault",A)}
    );

    --bbva-carousel-default--_ambient--skeleton-quote-color: var(
      --bbva-carousel-default--custom--primary-alt-ambient--skeleton-quote-color,
      ${f("colorPrimaryAltSurfaceAmbientPreloading",A)}
    );
    
    --bbva-carousel-default--_ambient--skeleton-animated-layer-bg: var(
      --bbva-carousel-default--custom--primary-alt-ambient--skeleton-animated-layer-bg,
      ${f("colorPrimaryAltSurfaceAmbientDefault",A)}
    );

    --bbva-carousel-default--_ambient--swiper-container-focus: var(
      --bbva-carousel-default--custom--primary-alt-ambient--swiper-container-focus,
      ${f("colorPrimaryAltSurfaceAmbientFocus",A)}
    );
  }
`,lt=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-carousel-default--_ambient--slide-bg-color: var(
      --bbva-carousel-default--custom--secondary-ambient--slide-bg-color,
      ${f("colorSecondarySurfaceAlternativeDefault",A)}
    );

    --bbva-carousel-default--_ambient--gradient-color: var(
      --bbva-carousel-default--custom--secondary-ambient--gradient-color,
      ${f("colorSecondaryAltSurfaceAlternativeDefault",A)}
    );

    --bbva-carousel-default--_ambient--skeleton-quote-color: var(
      --bbva-carousel-default--custom--secondary-ambient--skeleton-quote-color,
      ${f("colorSecondarySurfaceAmbientPreloading",A)}
    );
    
    --bbva-carousel-default--_ambient--skeleton-animated-layer-bg: var(
      --bbva-carousel-default--custom--secondary-ambient--skeleton-animated-layer-bg,
      ${f("colorSecondarySurfaceAmbientDefault",A)}
    );

    --bbva-carousel-default--_ambient--swiper-container-focus: var(
      --bbva-carousel-default--custom--secondary-ambient--swiper-container-focus,
      ${f("colorSecondarySurfaceAmbientFocus",A)}
    );
  }
`,ct=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-carousel-default--_ambient--slide-bg-color: var(
      --bbva-carousel-default--custom--secondary-alt-ambient--slide-bg-color,
      ${f("colorSecondaryAltSurfaceAlternativeDefault",A)}
    );

    --bbva-carousel-default--_ambient--gradient-color: var(
      --bbva-carousel-default--custom--secondary-alt-ambient--gradient-color,
      ${f("colorSecondarySurfaceAlternativeDefault",A)}
    );

    --bbva-carousel-default--_ambient--skeleton-quote-color: var(
      --bbva-carousel-default--custom--secondary-alt-ambient--skeleton-quote-color,
      ${f("colorSecondaryAltSurfaceAmbientPreloading",A)}
    );
    
    --bbva-carousel-default--_ambient--skeleton-animated-layer-bg: var(
      --bbva-carousel-default--custom--secondary-alt-ambient--skeleton-animated-layer-bg,
      ${f("colorSecondaryAltSurfaceAmbientDefault",A)}
    );

    --bbva-carousel-default--_ambient--swiper-container-focus: var(
      --bbva-carousel-default--custom--secondary-alt-ambient--swiper-container-focus,
      ${f("colorSecondaryAltSurfaceAmbientFocus",A)}
    );
  }
`,dt={primary:t`
    ${ot}
    ${et.primary}
    ${x.primary}
  `,primaryAlt:t`
    ${nt}
    ${et.primaryAlt}
    ${x.primaryAlt}
  `,secondary:t`
    ${lt}
    ${et.secondary}
    ${x.secondary}
  `,secondaryAlt:t`
    ${ct}
    ${et.secondaryAlt}
    ${x.secondaryAlt}
  `},ut=Object.values(dt);$.use([Q,V]);class bt extends(w(e(S(G(i))))){static get scopedElements(){return{"bbva-step-bar":at,"bbva-button-default":C}}static get is(){return"bbva-carousel-default"}static get properties(){return{items:{type:Array},selected:{type:Number},swiperConfig:{type:Object},variant:{type:String},scopedComponents:{type:Array,attribute:"scoped-components"},type:{type:String},_sliderContainer:{type:Object},_leftGradient:{type:Object},_rightGradient:{type:Object},scrollPosition:{type:Number},columns:{type:Number},closeItem:{type:Boolean,attribute:"close-item"},loop:{type:Boolean,reflect:!0},stepLength:{type:Number,attribute:"step-length"},_ariaLive:{type:Boolean,state:!0},_showMessageSlideDeleted:{type:Boolean},_slideDeleted:{type:Number},hideGradient:{type:Boolean,attribute:"hide-gradient",reflect:!0},loading:{type:Boolean,reflect:!0},loadingChevrons:{type:Boolean,attribute:"loading-chevrons",reflect:!0},iconBack:{type:String},iconClose:{type:String},iconNext:{type:String},fullWidth:{type:Boolean,attribute:"full-width"},autoplay:{type:Boolean,reflect:!0},isPlaying:{type:Boolean},isList:{type:Boolean},_desktop:{type:Boolean,attribute:!1},autoplayDelay:{type:Number,attribute:"autoplay-delay"},_hasImage:{type:Boolean},_itemsWithVisibilityState:{type:Array},visibilityThreshold:{type:Number,attribute:"visibility-threshold"},carouselAccessibilityText:{type:String,attribute:"carousel-accessibility-text"},slideCloseAccessibilityText:{type:String,attribute:"slide-close-accessibility-text"},prevChevronAccessibilityText:{type:String,attribute:"prev-chevron-accessibility-text"},nextChevronAccessibilityText:{type:String,attribute:"next-chevron-accessibility-text"}}}constructor(){super(),this.items=[],this.selected=0,this.swiperConfig={},this.variant="",this.type="scroll",this.scrollPosition=0,this.columns=1,this.closeItem=!1,this.loop=!1,this.iconBack=n(),this.iconClose=l(),this.iconNext=c(),this.keepSlideOnInit=!1,this.stepLength=0,this._ariaLive=!1,this.hideGradient=!1,this.loading=!1,this.loadingChevrons=!1,this.fullWidth=!1,this.autoplay=!1,this.isPlaying=!1,this.isList=!1,this._showMessageSlideDeleted=!1,this._desktop=!1,this.autoplayDelay=3e3,this._hasImage=!1,this._itemsWithVisibilityState=[],this.visibilityThreshold=.5,this._itemsVisibilityChange=this._itemsVisibilityChange.bind(this),this.carouselAccessibilityText="bbva-carousel-default-carousel-sr-description",this.slideCloseAccessibilityText="bbva-carousel-default-slide-close",this.prevChevronAccessibilityText="bbva-carousel-default-chevron-prev-aria-label",this.nextChevronAccessibilityText="bbva-carousel-default-chevron-next-aria-label"}static get styles(){return[rt,st,ut,a("bbva-carousel-default-shared-styles")]}update(t){var e;if(super.update(t),this._sliderContainer=this._sliderContainer||this.shadowRoot.querySelector(".swiper-container"),t.has("scopedComponents")&&this.scopedComponents&&this.scopedComponents.forEach((t=>{this.defineScopedElement(t.tagName,t.class)})),(t.has("loading")||t.has("loadingChevrons")||t.has("items"))&&null!==(e=this.items)&&void 0!==e&&e.length&&!this._loading){this.stepLength=this.items.length;(this.items[0].content instanceof d?this.items[0].content.strings[0]:this.items[0].content).includes("img")&&(this._hasImage=!0,this._sliderContainer.classList.add("image"))}t.has("autoplay")&&(this.isPlaying=this.autoplay)}get _loading(){return this.loading||this.loadingChevrons}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)"}}initializeSwiper(){this._swiper&&this._swiper.destroy(),this._swiper=new $(this._sliderContainer,this.configSwiper()),this._swiper.on("init",(()=>{this.requestUpdate(),"swipe"===this.type&&this.updateComplete.then((()=>{this._updateSlideAccessibility()}))})),this._swiper.init(),this._swiper.on("slideChange",(()=>{"swipe"===this.type&&(this._swiper.slides[this._swiper.previousIndex].setAttribute("aria-hidden",!0),this._select(this._swiper.realIndex),requestAnimationFrame((()=>{this._updateSlideAccessibility()})))})),this.loop&&this._swiper.on("slideChangeTransitionEnd",(()=>{this._swiper.loopFix()})),this.selected=this._setIndex()}_setIndex(){return this.selected||0}_fullWidth(){return this._desktop?this.fullWidth?0:32:this.fullWidth?0:8}configSwiper(){return{...{init:!1,loop:this.loop,freeMode:"scroll"===this.type,enabled:!(1===this.items.length),slidesPerView:this.getSlidesPerView(),spaceBetween:this._fullWidth(),speed:500,keyboard:{enabled:!0},initialSlide:this._setIndex(),loopAdditionalSlides:1,...this.autoplay&&{autoplay:{delay:this.autoplayDelay,disableOnInteraction:!1}}},...this.swiperConfig}}getSlidesPerView(){const t=+({swipe:{"two-columns":2,"three-columns":2.999,"four-columns":3.999,"five-columns":4.999,default:1},scroll:{"two-columns":1.409,"three-columns":2.351,"four-columns":3.3,"five-columns":4.15}}[this.type][this.variant]||"1");return this.columns=1===t?t:Math.floor(t+1),t}updated(t){super.updated(t),(t.has("loop")||t.has("items")||t.has("swiperConfig")||t.has("_desktop")||t.has("_hasImage")||t.has("_intlLanguage")||t.has("_intlResources")||t.has("loading"))&&this.initializeSwiper(),t.has("items")&&this._initIntersectionObserverControllers()}_select(t){this.selected!==t&&(this.selected=t,this.isPlaying||(this._ariaLive=!0),this.loop?this.scrollPosition=20*t:this.items.length>3&&t+1<this.items.length&&t>0&&(this.scrollPosition=20*(t-1)),this.dispatchEvent(new CustomEvent("carousel-default-item-select",{detail:this.selected,bubbles:!0,composed:!0})))}_tap(t){this.dispatchEvent(new CustomEvent("carousel-default-item-tap",{detail:t,bubbles:!0,composed:!0}))}_updateSlideAccessibility(){const t=this._swiper.slides.slice(this._swiper.activeIndex,this._swiper.activeIndex+Math.min(this._swiper.slidesPerViewDynamic(),this.items.length));this._swiper.slides.forEach((e=>{const i=!t.includes(e);i?(e.setAttribute("aria-hidden",i),e.setAttribute("tabindex",-1)):(e.removeAttribute("aria-hidden"),e.removeAttribute("tabindex"));const a=(t,e)=>{e?t.setAttribute("disabled",""):t.removeAttribute("disabled")};if(a(e,i),this.closeItem){a(e.querySelector(".swiper-slide-close"),i)}const s=e.querySelectorAll(`a, button, input, ${["button","link","checkbox","radio","tab","menuitem"].map((t=>`[role="${t}"]`)).join(", ")}`);i&&s.forEach((t=>{t.setAttribute("tabindex",-1)}))}))}_close(t,e){t.stopPropagation();const i=this.shadowRoot.querySelector(`.swiper-slide:nth-child(${this._getAdjustedIndex(e)})`);this.dispatchEvent(new CustomEvent("carousel-default-item-close",{detail:e,bubbles:!0,composed:!0})),this._showMessageSlideDeleted=!0,this._slideDeleted=e,i.classList.add("hide"),setTimeout((()=>{this._updateItem(e,i),this._showMessageSlideDeleted=!1}),500)}_updateItem(t,e){e.style.width=0,e.style.marginRight=0,e.style.height=0,setTimeout((()=>{this._deleteItem(t,e)}),500)}_deleteItem(t,e){const i=this.selected===this.items.length-(this.loop?1:this.columns);e.classList.remove("hide"),i&&(this.loop?(this.scrollPosition=0,this.selected=0):(this.scrollPosition=20*this.selected,this.selected-=1)),this.items=[...this.items.slice(0,t),...this.items.slice(t+1,this.items.length)],1===this.items.length&&(this.loop=!1),this.autoplay&&setTimeout((()=>{this._keepAutoplay()}),100)}_keepAutoplay(){this.isPlaying?this._swiper.autoplay.start():this._swiper.autoplay.stop()}_getAdjustedIndex(t){return this.loop?t+this._swiper.loopedSlides+1:t+1}_buttonClose(t,e){return e||this.closeItem?s`
        <div class="button-container" ambient="${this._hasImage?"secondary":""}">
          <bbva-button-default
            tabindex="${this._isDisabled(t)?-1:0}"
            aria-label="${this.t(this.slideCloseAccessibilityText)}"
            aria-describedby="${u("scroll"===this.type?void 0:`slide-${t}`)}"
            class="swiper-slide-close"
            icon="${this.iconClose}"
            icon-size="16"
            variant="icon no-background alternative"
            ?disabled=${this._isDisabled(t)}
            @click=${e=>this._close(e,t)}
          >
          </bbva-button-default>
        </div>
      `:s``}get _navigationChevronsTpl(){return s`
      <div class="chevrons">
        ${this.autoplay?this._playButton:""}

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
    `}_onChevronPrevClick(){this._swiper.slidePrev()}_togglePlay(){this.disabled||(this._ariaLive=!1,this.isPlaying=!this.isPlaying,this.isPlaying?this._swiper.autoplay.start():this._swiper.autoplay.stop())}_onChevronNextClick(){this._swiper.slideNext()}get _playButton(){return s`
      <bbva-button-default
        class="play-button"
        aria-label="${this.t(this.isPlaying?"bbva-carousel-default-automatic-pause":"bbva-carousel-default-automatic-play")}"
        variant="icon no-background"
        icon="${this.isPlaying?p():b()}"
        @click="${this._togglePlay}"
        aria-disabled=${this.disabled}
      >
      </bbva-button-default>
    `}_isDisabled(t){return this._swiper&&this._swiper.slides.length>0&&(t+1>this._swiper.slidesPerViewDynamic()+this._swiper.activeIndex||t+1<=this._swiper.activeIndex)}get _tpl(){return s`
      <div
        role="region"
        aria-labelledby="cards-heading"
        aria-live="${this._ariaLive&&"swipe"===this.type?"polite":"off"}"
        class="swiper-container ${this._desktop?"desktop":""}"
        id="${this.id}"
      >
        <p id="cards-heading" hidden>${this.t(this.carouselAccessibilityText)}</p>
        <div
          id="carouselSlides"
          class="swiper-wrapper"
          role="${u(this.isList&&"scroll"===this.type?"list":void 0)}"
        >
          ${"swipe"===this.type?this.items.map(((t,e)=>this._swipeTpl(t,e))):this.items.map(((t,e)=>this._scrollTpl(t,e)))}
        </div>
      </div>
      <div class="gradient bottom"></div>
      <div class="swiper-loading"><div class="skeleton"></div></div>

      ${this.items&&this.items.length>=1&&"swipe"===this.type?s`<div class="steps ${this._desktop?"desktop":""}">
            ${this._stepBar} ${this._navigationChevronsTpl}
          </div>`:s``}

      <div class="steps">
        <div class="chevrons-loading"><div class="skeleton"></div></div>
      </div>
      <span class="sr-only" aria-live="polite">
        ${this._showMessageSlideDeleted?this.t("bbva-carousel-default-slide-deleted",{slide:this._slideDeleted+1}):""}
      </span>
    `}_scrollTpl(t,e){return s`
      <div
        role="${u(this.isList&&"scroll"===this.type?"listitem":void 0)}"
        ambient="${(null==t?void 0:t.ambient)||""}"
        @click=${()=>this._tap(e)}
        @keypress="${()=>this._tap(e)}"
        class="swiper-slide"
      >
        ${this._buttonClose(e,null==t?void 0:t.closeItem)}
        ${t.content instanceof d?t.content:h(t.content)}
      </div>
    `}_swipeTpl(t,e){return s`
      <div
        ambient="${(null==t?void 0:t.ambient)||""}"
        tabindex="${u(this._isDisabled(e)?-1:void 0)}"
        @click=${()=>this._tap(e)}
        @keypress="${()=>this._tap(e)}"
        class="swiper-slide"
        role="group"
        aria-hidden="${u(this._isDisabled(e)?"true":void 0)}"
        aria-labelledby="slide-${e}"
      >
        <p id="slide-${e}" hidden>
          ${this.t("bbva-carousel-default-slide-aria-label",{slide:e+1,totalSlides:this.items&&this.items.length})}
        </p>
        ${this._buttonClose(e,null==t?void 0:t.closeItem)}
        ${t.content instanceof d?t.content:h(t.content)}
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
        `}_initIntersectionObserverControllers(){var t;const e=Array.from(this.shadowRoot.querySelectorAll(".swiper-slide"));null===(t=this._boxesIntersectionObserver)||void 0===t||t.disconnect(),this._itemsWithVisibilityState=e.map(((t,e)=>({id:`swiper-item-${e}`,target:t,visible:null}))),this._boxesIntersectionObserver=new H(this,{target:e,config:{threshold:this.visibilityThreshold,delay:300},callback:this._itemsVisibilityChange,skipInitial:!1})}_itemsVisibilityChange(t){for(const e of t){const t=this._itemsWithVisibilityState.find((t=>t.target===e.target));t&&t.visible!==e.isIntersecting&&(t.visible=e.isIntersecting)}const e=this._itemsWithVisibilityState.filter((t=>t.visible));this.dispatchEvent(new CustomEvent("carousel-default-item-visibility-change",{composed:!0,bubbles:!0,detail:{visible:e,all:this._itemsWithVisibilityState}}))}render(){return s`${this._tpl}`}}var pt=t`
  :host {
    --_sustainability_sustainability-section-cards-skeleton-quote-color: var(
      --sustainability-sustainability-section-cards--_ambient--default-skeleton-quote-color,
      var(
        --sustainability-sustainability-section-cards--custom--primary-ambient--default-skeleton-quote-color,
        ${f("colorPrimarySurfaceAlternativePreloading",A)}
      )
    );
    --_sustainability-sustainability-section-cards-skeleton-quote-bg: var(
      --sustainability-sustainability-section-cards--_ambient--default-skeleton-quote-bg,
      var(
        --sustainability-sustainability-section-cards--custom--primary-ambient--default-skeleton-quote-bg,
        ${f("colorPrimarySurfaceAmbientPreloading",A)}
      )
    );
    --_sustainability_sustainability-section-products-skeleton-quote-color: var(
      --sustainability-sustainability-section-products--_ambient--default-skeleton-quote-color,
      var(
        --sustainability-sustainability-section-products--custom--primary-ambient--default-skeleton-quote-color,
        ${f("colorPrimarySurfaceAmbientOverlay",A)}
      )
    );
    --_sustainability-sustainability-section-products-skeleton-quote-bg: var(
      --sustainability-sustainability-section-products--_ambient--default-skeleton-quote-bg,
      var(
        --sustainability-sustainability-section-products--custom--primary-ambient--default-skeleton-quote-bg,
        ${f("colorSecondaryAltSurfaceAmbientDefault",A)}
      )
    );
  }
`,ht=t`
  :host {
    display: contents;
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

  .header {
    padding: 1rem 1rem 0;
  }
  .header [data-tag-name='bbva-clip-microillustration'] {
    margin-bottom: 1rem;
  }

  [data-tag-name='bbva-type-link'] {
    padding: 0.5rem 0;
  }

  [data-tag-name='bbva-type-icon'] {
    --bbva-type-icon--_ambient--color: #1464a5;
  }

  img {
    height: 3.5rem;
  }

  .content {
    padding: 0 1rem 1rem;
  }

  .skeleton {
    position: relative;
    overflow: hidden;
    width: 100%;
    background-repeat: no-repeat;
    opacity: 1;
    pointer-events: none;
  }

  .skeleton-cards {
    height: 13rem;
    background-image: linear-gradient(
        var(--_sustainability_sustainability-section-cards-skeleton-quote-color) 100%,
        transparent 0
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_sustainability_sustainability-section-cards-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_sustainability_sustainability-section-cards-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_sustainability_sustainability-section-cards-skeleton-quote-color) 50%
      );
    background-color: var(--_sustainability-sustainability-section-cards-skeleton-quote-bg);
    background-size:
      80px 80px,
      calc((66% * 2) + (16px / 2)) 16px,
      calc((90% * 2) + (16px / 2)) 16px,
      calc((33% * 2) + (16px / 2)) 16px;
    background-position:
      16px 16px,
      16px 120px,
      16px 152px,
      16px 176px;
  }

  .skeleton-products {
    background-image: linear-gradient(
        var(--_sustainability_sustainability-section-products-skeleton-quote-color) 100%,
        transparent 0
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_sustainability_sustainability-section-products-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_sustainability_sustainability-section-products-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_sustainability_sustainability-section-products-skeleton-quote-color) 50%
      );
    background-color: var(--_sustainability-sustainability-section-products-skeleton-quote-bg);
    background-size:
      80px 80px,
      calc((66% * 2) + (16px / 2)) 16px,
      calc((90% * 2) + (16px / 2)) 16px,
      calc((33% * 2) + (16px / 2)) 16px;
    background-position:
      16px 16px,
      16px 120px,
      16px 152px,
      16px 176px;
  }

  .animation {
    background-color: var(--_sustainability-sustainability-section-cards-skeleton-quote-bg);
    position: relative;
    top: 0;
    left: 0;
    height: 13rem;
    animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
    opacity: 0.5;
    transform: translateX(200%) scaleX(1);
    transform-origin: right bottom;
  }

  .product-animations {
    background-color: var(--_sustainability-sustainability-section-products-skeleton-quote-bg);
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
`;class mt extends(q(E(e(i)))){static get is(){return"sustainability-sustainability-sections-card"}static get scopedElements(){const t=[...mt.configurationScopedElements(),P,B,D,k,T];return mt.scopedElementsFromClasses(t)}static get properties(){return{cardConfig:{type:Object,attribute:"card-config"},loading:{type:Boolean}}}static get styles(){return[pt,ht,a("sustainability-sustainability-sections-card-shared-styles"),_.primary,_.secondary,F.primary,F.secondary,R.primary,R.secondary,I.primary,I.secondary,Y.primary,Y.secondary,Y.primaryAlt,Y.secondaryAlt]}constructor(){super(),this.cardConfig={},this.loading=!1}_linkClicked(){this.dispatchEvent(new CustomEvent("sustainability-sustainability-sections-card-click",{detail:this.cardConfig,bubbles:!0,composed:!0}))}get _skeletonTemplate(){return s`
      <div class="${this.cardConfig.skeletonClass}">
        <div class="${this.cardConfig.animationClass}"></div>
      </div>
    `}get _cardTempalte(){var t,e,i,a,r,o,n,l,c,d,u,b,p;const h="offers"===this.cardConfig.id?"secondary":"primary";return s` <div>
      <div class="header" ambient="${h}">
        ${null!==(t=this.cardConfig)&&void 0!==t&&t.imageUrl?s`<img
              src="${null===(e=this.cardConfig)||void 0===e?void 0:e.imageUrl}"
              alt="${this.t("sustainability-landing-products-image-alt")}"
            />`:""}
        ${null!==(i=this.cardConfig)&&void 0!==i&&i.microillustration?s`<bbva-clip-microillustration
              microillustration="${null===(a=this.cardConfig)||void 0===a?void 0:a.microillustration}"
              size="M"
            ></bbva-clip-microillustration>`:""}
        ${null!==(r=this.cardConfig)&&void 0!==r&&r.icon?s`<bbva-type-icon
              icon-color="#004181"
              height="24"
              width="24"
              icon=${null===(o=this.cardConfig)||void 0===o?void 0:o.icon}
            ></bbva-type-icon>`:""}
        ${null!==(n=this.cardConfig)&&void 0!==n&&n.isFooterLink?s`<bbva-type-text
              tag="span"
              .text="${null===(c=this.cardConfig)||void 0===c?void 0:c.headerText}"
              size="XL"
              font-weight="500"
              ambient="${h}"
            ></bbva-type-text>`:s`<bbva-type-link size="M" @click="${this._linkClicked}"
              >${null===(l=this.cardConfig)||void 0===l?void 0:l.linkText}</bbva-type-link
            >`}
      </div>
      <div class="content" ambient="${h}">
        <bbva-type-text
          unset
          tag="span"
          ?hidden="${!(null!==(d=this.cardConfig)&&void 0!==d&&d.descriptionText)}"
          text="${null===(u=this.cardConfig)||void 0===u?void 0:u.descriptionText}"
          size="M"
        >
        </bbva-type-text>
        ${null!==(b=this.cardConfig)&&void 0!==b&&b.isFooterLink?s`<bbva-type-link size="S" ambient="${h}" @click="${this._linkClicked}"
              >${null===(p=this.cardConfig)||void 0===p?void 0:p.linkText}</bbva-type-link
            >`:""}
      </div>
    </div>`}render(){return s` ${this.loading?this._skeletonTemplate:this._cardTempalte}`}}var gt=t`
  :host {
    --_sustainability-sustainability-section-bg-color: var(
      --sustainability-sustainability-section--_ambient--default-bg-color,
      var(
        --sustainability-sustainability-section--custom--primary-ambient--default-bg-color,
        ${f("colorPrimarySurfaceAmbientDefault",A)}
      )
    );
    --_sustainability_sustainability-section-cards-skeleton-quote-color: var(
      --sustainability-sustainability-section-cards--_ambient--default-skeleton-quote-color,
      var(
        --sustainability-sustainability-section-cards--custom--primary-ambient--default-skeleton-quote-color,
        ${f("colorPrimarySurfaceAlternativePreloading",A)}
      )
    );
    --_sustainability-sustainability-section-cards-skeleton-quote-bg: var(
      --sustainability-sustainability-section-cards--_ambient--default-skeleton-quote-bg,
      var(
        --sustainability-sustainability-section-cards--custom--primary-ambient--default-skeleton-quote-bg,
        ${f("colorPrimarySurfaceAmbientPreloading",A)}
      )
    );
    --_sustainability_sustainability-section-products-skeleton-quote-color: var(
      --sustainability-sustainability-section-products--_ambient--default-skeleton-quote-color,
      var(
        --sustainability-sustainability-section-products--custom--primary-ambient--default-skeleton-quote-color,
        ${f("colorPrimarySurfaceAmbientOverlay",A)}
      )
    );
    --_sustainability-sustainability-section-products-skeleton-quote-bg: var(
      --sustainability-sustainability-section-products--_ambient--default-skeleton-quote-bg,
      var(
        --sustainability-sustainability-section-products--custom--primary-ambient--default-skeleton-quote-bg,
        ${f("colorSecondaryAltSurfaceAmbientDefault",A)}
      )
    );
  }
`,yt=t`
  :host {
    display: block;
    box-sizing: border-box;
    background-color: var(--_sustainability-sustainability-section-bg-color);
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

  [data-tag-name='bbva-type-text'] {
    margin: 0.5rem 1rem 0.5rem;
  }

  [data-tag-name='bbva-header-category'] {
    padding: 0.5rem 1rem;
  }

  .section-error-wrapper {
    position: relative;
    padding: 0 1rem 0 1rem;
    margin: 1rem 0;
  }
  .section-error-wrapper [data-tag-name='bbva-progress-content'] {
    position: absolute;
  }
`;class vt extends(q(E(e(i)))){static get is(){return"sustainability-sustainability-section"}static get scopedElements(){const t=[...vt.configurationScopedElements(),mt,T,L,M,j,N,k,O,bt];return vt.scopedElementsFromClasses(t)}static get properties(){return{simulatorHomeData:{type:Object,attribute:"simulator-home-data"},simulatorCarData:{type:Object,attribute:"simulator-car-data"},offers:{type:Object,attribute:"offers"},sustainabilityApiVersion:{type:String,attribute:"sustainability-api-version"},offersApiVersion:{type:String,attribute:"offers-api-version"},loanIds:{type:Array,attribute:"loan-ids"},loanType:{type:String,attribute:"loan-type"},userName:{type:String,attribute:"user-name"},localCurrency:{type:String,attribute:"local-currency"},toggles:{type:Object},_offerImageUrl:{type:String},maxRequestAttempts:{type:Number,attribute:"max-request-attempts"},_requestErrors:{type:Object},_currentRequests:{type:Object}}}constructor(){super(),this.simulatorCarData={},this.simulatorHomeData={},this.offer=[],this.config={header:{variant:"first-level-sequential",showLeftIcon:!0,leftIconLabel:this.t("sustainability-landing-header-back"),leftIconAriaLabel:this.t("sustainability-landing-header-back"),text:this.t("sustainability-landing-header-main-title"),buttons:[{id:"btn-menu",icon:m(),label:this.t("sustainability-landing-header-main-menu"),accessibilityText:"sustainability-landing-header-main-menu"}],id:"main-header","@header-main-icon-click":this._manageHeaderMainClicks.bind(this)},loader:!0,notify:!1,fixedHeader:!0},this._requestErrors={carSimulator:0,homeAppliance:0,offers:0},this._currentRequests={carSimulator:!1,homeAppliance:!1,offers:!1},this.sustainabilityApiVersion="1",this.offersApiVersion="1",this.loanIds=["0NOM","0PPI","0060"],this.loanType="LOANS",this.userName="",this.localCurrency="MXN",this.toggles={},this._defaultToggles={carbonFootprint:!0},this.maxRequestAttempts=3,this._offerImageUrl="images/sustainable_loan.svg"}static get styles(){return[yt,gt,_.primary,_.secondary,z.primary,z.secondary,Y.primary,Y.secondary,Y.primaryAlt,Y.secondaryAlt,z.primary,dt.primary,dt.secondary,a("sustainability-sustainability-section-shared-styles")]}firstUpdated(t){super.firstUpdated(t),this._requestData()}navigateForward(t={}){this.dispatchEvent(new CustomEvent(`sustainability-sustainability-section-navigation-${null==t?void 0:t.id}`,{detail:{id:null==t?void 0:t.id,params:null!=t&&t.params?null==t?void 0:t.params:"detail"},bubbles:!0,composed:!0}))}get _toggles(){return{...this.toggles,...this._defaultToggles}}get _headers(){return this.headers||{"Accept-Language":this.language}}get carSimulatorDmElement(){return this._carSimulatorDmElement||(this._carSimulatorDmElement=this.shadowRoot.querySelector("#car-simulator-api-dm")),this._carSimulatorDmElement}get homeApplianceDmElement(){return this._homeApplianceDmElement||(this._homeApplianceDmElement=this.shadowRoot.querySelector("#home-simulator-api-dm")),this._homeApplianceDmElement}get offersDmElement(){return this._offersDmElement||(this._offersDmElement=this.shadowRoot.querySelector("#offers-api-dm")),this._offersDmElement}_requestHomeAppliance(){this._currentRequests={...this._currentRequests,homeAppliance:!0},this.homeApplianceDmElement.postHomeSimulator()}_requestCarSimulator(){this._currentRequests={...this._currentRequests,carSimulator:!0},this.carSimulatorDmElement.postCarSimulator()}_requestOffers(){this._currentRequests={...this._currentRequests,offers:!0},this.offersDmElement.getOffers()}_requestData(){this.homeApplianceDmElement&&this._toggles.homeAppliance&&this._requestHomeAppliance(),this.carSimulatorDmElement&&this._toggles.carSimulator&&this._requestCarSimulator(),this.offersDmElement&&this._toggles.offers&&this._requestOffers()}_manageHeaderMainClicks(t){var e;const i=null==t||null===(e=t.detail)||void 0===e?void 0:e.index;this.dispatchEvent(new CustomEvent({1:"sustainability-sustainability-section-menu-click",0:"navigation-go-back"}[i],{composed:!0,bubbles:!0}))}get _hasOffersError(){return this._requestErrors.offers>0}get _hasCarSimulatorError(){var t;return(null===(t=this._requestErrors)||void 0===t?void 0:t.carSimulator)>0}get _hasHomeApplianceError(){var t;return(null===(t=this._requestErrors)||void 0===t?void 0:t.homeAppliance)>0}_onSimulatorRequestSuccessCar({detail:t}){this._requestErrors={...this._requestErrors,carSimulator:0},this._currentRequests={...this._currentRequests,carSimulator:!1},this.simulatorCarData={...t}}_onSimulatorRequestSuccessHome({detail:t}){this._requestErrors={...this._requestErrors,homeAppliance:0},this._currentRequests={...this._currentRequests,homeAppliance:!1},this.simulatorHomeData={...t}}_onOffersRequestSuccess({detail:t}){this._requestErrors={...this._requestErrors,offers:0},this._currentRequests={...this._currentRequests,offers:!1},this.offer=t?t.filter((t=>{var e,i,a;return this.loanIds.includes(null==t||null===(e=t.product)||void 0===e?void 0:e.id)&&(null==t||null===(i=t.product)||void 0===i||null===(a=i.productType)||void 0===a?void 0:a.id)===this.loanType})):[]}_onRequestError(t){this._requestErrors={...this._requestErrors,[t]:this._requestErrors[t]+1},this._currentRequests={...this._currentRequests,[t]:!1}}get _requestServicesDmTemplate(){return s`
      <bbva-global-car-simulator-api-dm
        id="car-simulator-api-dm"
        .host="${this.host}"
        .headers="${this._headers}"
        .version="${this.sustainabilityApiVersion}"
        .requiredToken="${this.requiredToken}"
        .native="${this.native}"
        @car-simulator-api-dm-fetch="${this._onSimulatorRequestSuccessCar}"
        @car-simulator-api-dm-fetch-error="${()=>{this._onRequestError("carSimulator")}}"
        @api-dm-error="${()=>{this._onRequestError("carSimulator")}}"
      >
      </bbva-global-car-simulator-api-dm>
      <bbva-global-home-simulator-api-dm
        id="home-simulator-api-dm"
        .host="${this.host}"
        .headers="${this._headers}"
        .version="${this.sustainabilityApiVersion}"
        .requiredToken="${this.requiredToken}"
        .native="${this.native}"
        @home-simulator-api-dm-fetch="${this._onSimulatorRequestSuccessHome}"
        @home-simulator-api-dm-fetch-error="${()=>{this._onRequestError("homeAppliance")}}"
        @api-dm-error="${()=>{this._onRequestError("homeAppliance")}}"
      >
      </bbva-global-home-simulator-api-dm>
      <bbva-global-offers-api-dm
        id="offers-api-dm"
        .host="${this.host}"
        .headers="${this._headers}"
        .version="${this.offersApiVersion}"
        .requiredToken="${this.requiredToken}"
        .native="${this.native}"
        @offers-api-dm-fetch="${this._onOffersRequestSuccess}"
        @offers-api-dm-fetch-error="${()=>{this._onRequestError("offers")}}"
        @api-dm-error="${()=>{this._onRequestError("offers")}}"
      >
      </bbva-global-offers-api-dm>
    `}get _simulatorsSolarPanelsConfig(){return{id:"solar-panels-simulator",microillustration:"solarpanel",headerText:this.t("sustainability-landing-selection-header-simulator-solar-panels"),linkText:this.t("sustainability-landing-selection-link-simulator"),descriptionText:this.t("sustainability-landing-selection-description-simulator-solar-panels"),isFooterLink:!0,skeletonClass:"skeleton skeleton-cards",animationClass:"animation"}}get _simulatorsHomeConfig(){var t,e,i;const a=null!==(t=this.simulatorHomeData)&&void 0!==t&&t.savings?null===(e=this.simulatorHomeData)||void 0===e?void 0:e.savings.find((t=>{var e;return"ELECTRICITY"===(null===(e=t.savingType)||void 0===e?void 0:e.id)})):"",s=a?g(null===(i=a.savingAmounts)||void 0===i?void 0:i.amount,{currencyCode:this.localCurrency,showCurrencyCode:!1,decimalsHidden:!0,language:this.language,localCurrency:this.localCurrency}):"";return{id:"appliance-simulator",microillustration:"homeappliances",headerText:this.t("sustainability-landing-selection-header-simulator-appliance"),descriptionText:a?this.t("sustainability-landing-selection-description-simulator-appliance",{amount:s}):"",linkText:this.t("sustainability-landing-selection-link-simulator"),isFooterLink:!0,skeletonClass:"skeleton skeleton-cards",animationClass:"animation"}}get _simulatorsCarConfig(){var t,e,i,a,s,r,o,n,l,c;const d=g(null===(t=this.simulatorCarData)||void 0===t||null===(e=t.totalSaving)||void 0===e||null===(i=e.savingAmount)||void 0===i?void 0:i.amount,{currencyCode:null===(a=this.simulatorCarData)||void 0===a||null===(s=a.totalSaving)||void 0===s||null===(r=s.savingAmount)||void 0===r?void 0:r.currency,showCurrencyCode:!1,decimalsHidden:!0,language:this.language,localCurrency:this.localCurrency});return{id:"car-simulator",microillustration:"ecocar",headerText:`sustainability-landing-simulator-car-type-${null===(o=this.simulatorCarData)||void 0===o||null===(n=o.totalSaving)||void 0===n||null===(l=n.engineType)||void 0===l?void 0:l.id}`,descriptionText:null!==(c=this.simulatorCarData)&&void 0!==c&&c.totalSaving?this.t("sustainability-landing-selection-description-simulator-car",{amount:d}):"",linkText:this.t("sustainability-landing-selection-link-simulator"),isFooterLink:!0,skeletonClass:"skeleton skeleton-cards",animationClass:"animation"}}_offersCardConfig(t){var e,i,a,s,r,o,n,l,c,d,u,b,p;const h=`${null==t||null===(e=t.description)||void 0===e||null===(i=e.trim())||void 0===i?void 0:i.replace(/\.$/,"")} ${(null==t||null===(a=t.amounts)||void 0===a||null===(s=a[0])||void 0===s||null===(r=s.description)||void 0===r?void 0:r.toLowerCase())||""} ${null!=t&&null!==(o=t.amounts)&&void 0!==o&&null!==(n=o[0])&&void 0!==n&&n.amount?g(null==t||null===(l=t.amounts)||void 0===l||null===(c=l[0])||void 0===c?void 0:c.amount,{currencyCode:null==t||null===(d=t.amounts)||void 0===d||null===(u=d[0])||void 0===u?void 0:u.currency,localCurrency:this.localCurrency,showCurrencyCode:!1,decimalsHidden:!0,language:this.language}):""}`.trim();return{id:"offers",linkText:this.t("sustainability-landing-offers-carousel-link"),imageUrl:null!=t&&null!==(b=t.image)&&void 0!==b&&b.url?null==t||null===(p=t.image)||void 0===p?void 0:p.url:this._offerImageUrl,headerText:"",descriptionText:h,isFooterLink:!0,skeletonClass:"skeleton skeleton-products",animationClass:"animation product-animations",payload:t}}get _carbonFootprintSectionConfig(){return{sustainabilityCardConfig:{id:"carbon-footprint",linkText:this.t("sustainability-landing-sustainability-header"),icon:y(),descriptionText:this.t("sustainability-landing-sustainability-description"),isFooterLink:!1,skeletonClass:"skeleton",animationClass:"animation"},forestryProyectsCardConfig:{id:"forestry-proyects",linkText:this.t("sustainability-landing-forestry-projects-header"),icon:v(),descriptionText:this.t("sustainability-landing-forestry-projects-description"),isFooterLink:!1,skeletonClass:"skeleton",animationClass:"animation"}}}get _headerTemplate(){var t,e,i;return s`
      <div class="container">
        <bbva-type-text
          ambient="primary"
          tag="span"
          text="${this.userName?this.t("sustainability-landing-header-text-with-name",{name:this.userName}):this.t("sustainability-landing-header-text")}"
          size="3XL"
          font-weight="500"
          .loading=${(null===(t=this._currentRequests)||void 0===t?void 0:t.carSimulator)||(null===(e=this._currentRequests)||void 0===e?void 0:e.homeAppliance)||(null===(i=this._currentRequests)||void 0===i?void 0:i.offers)}
        ></bbva-type-text>
      </div>
    `}_linkErrorClicked(t){"homeAppliance"===t&&this._requestHomeAppliance(),"carSimulator"===t&&this._requestCarSimulator(),"offers"===t&&this._requestOffers()}_errorTemplate(t){const e=this._requestErrors[t]>this.maxRequestAttempts;return s` <div class="section-error-wrapper">
      <bbva-notification-message
        variant="error"
        book-title
        .messageTitle="${e?this.t("sustainability-landing-error-text"):this.t("sustainability-landing-error-retry-text")}"
        .linkTitle="${e?"":this.t("sustainability-landing-link-retry-text")}"
        @notification-message-link-click="${()=>this._linkErrorClicked(t)}"
      ></bbva-notification-message>
      <bbva-progress-content
        variant="transparent"
        ?visible="${this._currentRequests[t]}"
      ></bbva-progress-content>
    </div>`}get _solarPanelsTemplate(){var t;const e=null===(t=this._currentRequests)||void 0===t?void 0:t.solarPanels;return s` <bbva-panel-container variant="card">
      <sustainability-sustainability-sections-card
        id="solar-panels"
        .cardConfig="${this._simulatorsSolarPanelsConfig}"
        .loading="${e}"
        @sustainability-sustainability-sections-card-click="${({detail:t})=>this.navigateForward({id:t.id,params:t.payload})}"
      ></sustainability-sustainability-sections-card>
    </bbva-panel-container>`}get _homeApplianceTemplate(){var t;const e=null===(t=this._currentRequests)||void 0===t?void 0:t.homeAppliance;return s` <bbva-panel-container variant="card">
      <sustainability-sustainability-sections-card
        id="home-appliance"
        .cardConfig="${this._simulatorsHomeConfig}"
        .loading="${e}"
        @sustainability-sustainability-sections-card-click="${({detail:t})=>this.navigateForward({id:t.id,params:t.payload})}"
      ></sustainability-sustainability-sections-card>
    </bbva-panel-container>`}get _carSimulatorTemplate(){var t;const e=null===(t=this._currentRequests)||void 0===t?void 0:t.carSimulator;return s`
      <bbva-panel-container variant="card">
        <sustainability-sustainability-sections-card
          id="car-simulator"
          .cardConfig="${this._simulatorsCarConfig}"
          .loading="${e}"
          @sustainability-sustainability-sections-card-click="${({detail:t})=>this.navigateForward({id:t.id,params:t.payload})}"
        ></sustainability-sustainability-sections-card>
      </bbva-panel-container>
    `}get _offersTemplate(){var t;const e=null===(t=this._currentRequests)||void 0===t?void 0:t.offers;return s` <bbva-header-category
        text="${this.t("sustainability-landing-offers-header")}"
        .loading="${e}"
        ambient="primary"
      ></bbva-header-category>
      <bbva-type-text
        text="${this.t("sustainability-landing-offers-description")}"
        size="M"
        .loading="${e}"
        ambient="primary"
      >
      </bbva-type-text>
      <div>
        ${this._hasOffersError?this._errorTemplate("offers"):s`<bbva-carousel-default
              type="scroll"
              ambient="primary"
              variant="${this.offer.length>1?"two-columns":""}"
              .scopedComponents="${[{tagName:"sustainability-sustainability-sections-card",class:mt},{tagName:"bbva-panel-container",class:T}]}"
              .items="${this.offer.map((t=>({content:s`<bbva-panel-container panel-color="secondary">
                  <sustainability-sustainability-sections-card
                    id="offers"
                    .cardConfig="${this._offersCardConfig(t)}"
                    .loading="${e}"
                    @sustainability-sustainability-sections-card-click="${({detail:t})=>this.navigateForward({id:t.id,params:t.payload})}"
                  ></sustainability-sustainability-sections-card>
                </bbva-panel-container>`})))}"
            >
            </bbva-carousel-default>`}
      </div>`}get _carbonFootprintSection(){var t,e,i,a;return s` ${this._toggles.carbonFootprint||this._toggles.forestryProyects?s`
          <bbva-header-category
            text="${this.t("sustainability-landing-contribution-description-header")}"
            size="M"
            .loading="${(null===(t=this._currentRequests)||void 0===t?void 0:t.forestryProyects)||(null===(e=this._currentRequests)||void 0===e?void 0:e.carbonFootprint)}"
            ambient="primary"
          ></bbva-header-category>
        `:""}
    ${this._toggles.carbonFootprint?s`
          <bbva-panel-container variant="card">
            <sustainability-sustainability-sections-card
              id="carbon-footprint"
              .cardConfig="${this._carbonFootprintSectionConfig.sustainabilityCardConfig}"
              .loading="${null===(i=this._currentRequests)||void 0===i?void 0:i.carbonFootprint}"
              @sustainability-sustainability-sections-card-click="${({detail:t})=>this.navigateForward({id:t.id,params:t.payload})}"
            ></sustainability-sustainability-sections-card>
          </bbva-panel-container>
        `:""}
    ${this._toggles.forestryProyects?s`
          <bbva-panel-container variant="card">
            <sustainability-sustainability-sections-card
              id="forestry-proyect"
              .cardConfig="${this._carbonFootprintSectionConfig.forestryProyectsCardConfig}"
              .loading="${null===(a=this._currentRequests)||void 0===a?void 0:a.forestryProyects}"
              @sustainability-sustainability-sections-card-click="${({detail:t})=>this.navigateForward({id:t.id,params:t.payload})}"
            ></sustainability-sustainability-sections-card>
          </bbva-panel-container>
        `:""}`}render(){return s`
      <div>
        ${super.render()} ${this._requestServicesDmTemplate} ${this._headerTemplate}
        ${this._toggles.solarPanel?this._solarPanelsTemplate:""}
        ${this._toggles.homeAppliance&&!this._hasHomeApplianceError?this._homeApplianceTemplate:""}
        ${this._hasHomeApplianceError?this._errorTemplate("homeAppliance"):""}
        ${this._toggles.carSimulator&&!this._hasCarSimulatorError?this._carSimulatorTemplate:""}
        ${this._hasCarSimulatorError?this._errorTemplate("carSimulator"):""}
        ${this._toggles.offers&&(0!==this.offer.length||this._hasOffersError)?this._offersTemplate:""}
        ${this._carbonFootprintSection}
      </div>
    `}}customElements.define(vt.is,vt);class ft extends i{static get is(){return"bbva-analyticmanager-sustainability-section"}static get properties(){return{persistData:{type:Object}}}constructor(){super(),this.persistData={}}static get styles(){return[U,a("bbva-analyticmanager-sustainability-shared-styles")]}manageAnalyticsExternalNavigation(t){var e,i,a;this.persistData={pruductName:"0NOM"===(null==t||null===(e=t.params)||void 0===e||null===(i=e.product)||void 0===i||null===(a=i.productType)||void 0===a?void 0:a.name)?"prestamo nomina":"prestamo personal inmediato"},this._dispatch(`navigate-${null==t?void 0:t.id}`,this.persistData)}_dispatch(t,e){this.dispatchEvent(new CustomEvent(`${ft.is}-${t}`,{bubbles:!0,composed:!0,detail:e}))}}customElements.define(ft.is,ft);var At=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}
`;class _t extends i{static get is(){return"bbva-controller-sustainability-section-mx"}static get properties(){return{featureFlags:{type:Object},toggles:{type:Object}}}constructor(){super(),this.featureFlags={},this.toggles={}}static get styles(){return[At,a("bbva-controller-sustainability-section-mx-shared-styles")]}setCachedUser(t){const e=null==t?void 0:t.username;this._dispatch("set-cached-user",e)}updated(t){if(t.has("featureFlags")&&Object.keys(this.featureFlags).length){var e,i,a,s,r,o;const t={solarPanel:null===(e=this.featureFlags["glomo.sustainability.solarPanelSimulator"])||void 0===e?void 0:e.value,homeAppliance:null===(i=this.featureFlags["glomo.sustainability.applianceSimulator"])||void 0===i?void 0:i.value,carSimulator:null===(a=this.featureFlags["glomo.sustainability.carSimulator"])||void 0===a?void 0:a.value,offers:null===(s=this.featureFlags["glomo.sustainability.products"])||void 0===s?void 0:s.value,carbonFootprint:null===(r=this.featureFlags["glomo.sustainability.carbonFootprint"])||void 0===r?void 0:r.value,forestryProyects:null===(o=this.featureFlags["glomo.sustainability.sustainabilityCarbonFootprintOffset"])||void 0===o?void 0:o.value};this._dispatch("set-toggles-flags",t),this._validateStatusFlags(t)}}_validateStatusFlags(t){(t.homeAppliance||t.carSimulator||t.offers)&&this._dispatch("flags-updated-complete")}manageProductsNavigation(t){var e,i,a;const s={offerId:null==t||null===(e=t.params)||void 0===e?void 0:e.id,productId:null==t||null===(i=t.params)||void 0===i||null===(a=i.product)||void 0===a?void 0:a.contractId};this._dispatch("navigate-to-product",s)}_dispatch(t,e){this.dispatchEvent(new CustomEvent(`${_t.is}-${t}`,{bubbles:!0,composed:!0,detail:e}))}}customElements.define("bbva-controller-sustainability-section-mx",_t);
