import{z as t,a8 as a,a9 as o,aI as r,aJ as e,a as i,L as s,aK as n,aL as l,ak as c,h as d,Z as p,g as b}from"./952f98a9.js";var g=t`
:host {
  --_clip-product-bg-color: var(--bbva-clip-product-dark-mode-bg-color, var(--bbva-clip-product-bg-color, var(--colorsSecondary100, ${a(o.secondary100)})));
  --_clip-product-secondary-bg-color: var(--bbva-clip-product-dark-mode-secondary-bg-color, var(--bbva-clip-product-secondary-bg-color, var(--colorsSecondary200, ${a(o.secondary200)})));
  --skeleton-quote-color: var(--bbva-clip-product-skeleton-dark-mode-color, var(--bbva-clip-product-skeleton-color, var(--colorsSecondary200, ${a(o.secondary200)})));
  --skeleton-quote-bg: var(--bbva-clip-product-skeleton-dark-mode-bg-color, var(--bbva-clip-product-skeleton-bg, transparent));
  --_bbva-clip-product-skeleton-animated-layer-bg: var(--bbva-clip-product-dark-mode-skeleton-animated-layer-bg-color, var(--bbva-clip-product-skeleton-animated-layer-bg, var(--ambientsLight, ${a(r.light)})));
  display: inline-block;
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

.item {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 2.125rem;
}

.bg {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 4rem;
  height: 4rem;
  border-radius: 6.25rem;
  background-color: var(--_clip-product-bg-color);
}

.avatar {
  display: flex;
  justify-content: center;
  align-items: center;
}

svg {
  width: 100%;
  height: 100%;
}

:host([variant=maximum]) .bg,
:host([variant=two-options]) .bg {
  width: 8.5rem;
  height: 4rem;
  background-image: linear-gradient(110deg, var(--_clip-product-secondary-bg-color) 50%, transparent 0);
}
:host([variant=maximum]) .avatar,
:host([variant=two-options]) .avatar {
  flex-basis: 50%;
}

:host([loading]) {
  position: relative;
  overflow: hidden;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  height: 4rem;
  width: 4rem;
  background-image: radial-gradient( 60px 100%, var(--skeleton-quote-color) 50%, transparent 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 60px 60px;
  background-position: 0 0;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  height: 4rem;
  background: var(--_bbva-clip-product-skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}
:host([loading]):host([variant=maximum]), :host([loading]):host([variant=two-options]) {
  height: 4rem;
  width: 8.5rem;
  background-image: radial-gradient( 60px 100%, var(--skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, var(--skeleton-quote-color) 50%, transparent 50%), radial-gradient( 60px 100%, var(--skeleton-quote-color) 50%, transparent 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 60px 60px, calc((15px * 2) + (60px/ 2)) 60px, calc((15px * 2) + (60px/ 2)) 60px, 60px 60px;
  background-position: 0 0, 34px 0, 36px 0, 71px 0;
}
:host([loading]):host([variant=maximum]) .skeleton, :host([loading]):host([variant=two-options]) .skeleton {
  height: 4rem;
}

:host([variant=maximum]) :not(.item-large) .item,
:host([variant=two-options]) :not(.item-large) .item {
  flex-basis: 50%;
  width: 4rem;
  height: 2rem;
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
    transform: translateX(0%) scaleX(2);
    opacity: 0;
  }
}
`;class m extends(e(i(s))){static get scopedElements(){return{"bbva-clip-box":n,"bbva-clip-microillustration":l}}static get is(){return"bbva-clip-product"}static get properties(){return{item:{type:String},itemRight:{type:String,attribute:"item-right"},userText:{type:String,attribute:"user-text"},userTextRight:{type:String,attribute:"user-text-right"},userImage:{type:String,attribute:"user-image"},userImageRight:{type:String,attribute:"user-image-right"},size:{type:String},variant:{type:String},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.loading=!1}static get styles(){return[g,super.styles,c("bbva-clip-product-shared-styles")]}get _minimumDrawable(){return!this.variant||this.variant&&("maximum"===this.variant.toLowerCase()||"two-options"===this.variant)}get _maximumDrawable(){return this._minimumDrawable&&this.variant&&("maximum"===this.variant.toLowerCase()||"two-options"===this.variant)}static microillustration(t){return d`
      <bbva-clip-microillustration
        .microillustration="${t}" size="S"></bbva-clip-box>
    `}static showAvatar(t,a,o){return a||o?d`
          <div class="avatar">
            <bbva-clip-box
              aria-disabled="true"
              size="large"
              class="bitone"
              .text="${a}"
              .image="${o}"
            ></bbva-clip-box>
          </div>
        `:d` <div class="item">${m.microillustration(t)}</div> `}render(){return d`
      ${this.loading?d`<div class="skeleton"></div>`:d`
            <span class="sr-only">
              <slot></slot>
            </span>
            <div class="bg">
              ${this._minimumDrawable?d`
                    ${m.showAvatar(this.item,this.userText,this.userImage,this.size)}
                  `:""}
              ${this._maximumDrawable?d`
                    ${m.showAvatar(this.itemRight,this.userTextRight,this.userImageRight)}
                  `:""}
            </div>
          `}
    `}}var u={...p,bbvaClipProduct:`\n  --bbva-clip-product-dark-mode-bg-color: ${b("colors.cool60")};\n  --bbva-clip-product-dark-mode-secondary-bg-color: ${b("colors.cool50")};\n  --bbva-clip-product-dark-mode-skeleton-quote-color: ${b("colors.cool50")};\n  --bbva-clip-product-dark-mode-skeleton-quote-bg: ${b("colors.cool100")};\n\n  --bbva-clip-product-skeleton-dark-mode-color: ${b("colors.cool50")};\n  --bbva-clip-product-dark-mode-skeleton-animated-layer-bg-color: ${b("colors.cool90")};\n  `};export{m as B,u as b};
