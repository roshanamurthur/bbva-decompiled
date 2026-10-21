import{z as e,a8 as a,ac as o,ad as r,ap as t,aS as i,L as n,bC as c,bj as d,bD as s,bE as l,ak as b,h as p,av as m}from"./952f98a9.js";import{R as h,S as v,u as g,T as u,E as y,v as f,W as k,w as x,x as _,I as $}from"./216055dc.js";var S=e`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

:host {
  display: block;
  box-sizing: border-box;
  --_expandable-accordion-header-padding: var(--bbva-expandable-accordion-header-padding, 0);
  --_expandable-accordion-container-padding: var(--bbva-expandable-accordion-container-padding, 0);
}
:host:after {
  display: block;
  content: "";
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
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

:host(:not([focus-visible])) .header-accordion {
  outline: none;
}

:host([focus-visible]:not([aria-disabled=true])) .header-accordion {
  outline: 0.125rem solid var(--_expandable-accordion-focus-border-color);
  outline-offset: 0.25rem;
}

:host([divider=fit]) [data-tag-name=bbva-divider-default] {
  display: block;
  padding: 0 1rem;
}

.header-accordion {
  display: flex;
  width: 100%;
  min-height: 3.5rem;
  box-sizing: border-box;
  align-items: center;
  justify-content: space-between;
  padding: var(--_expandable-accordion-header-padding);
  border: none;
  background: none;
  cursor: pointer;
  font-family: inherit;
  font-size: var(--typographyTypeSmall, ${a(o.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${a(r.typeSmall)});
}
.header-accordion:active, .header-accordion:hover {
  background-color: var(--_expandable-accordion-header-bg-color-pressed);
}
.header-accordion:active [data-tag-name=bbva-type-icon], .header-accordion:hover [data-tag-name=bbva-type-icon] {
  fill: var(--_expandable-accordion-right-icon-pressed-color);
}

[data-tag-name=bbva-type-icon] {
  height: 100%;
  flex: none;
  margin-right: var(--expandable-accordion-right-icon-margin-right, 1rem);
  fill: var(--_expandable-accordion-right-icon-color);
}
[data-tag-name=bbva-type-icon].desktop {
  margin-right: 0;
  margin-left: 1rem;
}

::slotted([slot=content]) {
  padding: var(--_expandable-accordion-container-padding);
}

::slotted([slot=header]) {
  min-width: 0;
}

:host([loading]) {
  overflow: hidden;
  width: 100%;
  min-height: 3.5rem;
}
:host([loading]) .skeleton {
  background-color: var(--_skeleton-default-bg-color);
  mask-image: linear-gradient(black 100%, transparent 0);
  mask-position: calc(100% - 16px) 16px;
  mask-repeat: no-repeat;
  mask-size: 24px 24px;
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
  height: 2.375rem;
}
:host([loading]) .skeleton::after {
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
:host([loading]) [data-tag-name=bbva-divider-default] {
  display: block;
  margin-top: 1rem;
}

.header {
  margin: 0;
}

@media (min-width: 768px) {
  :host([loading]) .skeleton {
    height: 0.1875rem;
    background-color: var(--_skeleton-default-bg-color);
    mask-image: linear-gradient(black 100%, transparent 0);
    mask-position: 16px 16px;
    mask-repeat: no-repeat;
    mask-size: 24px 24px;
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
  :host([loading]) .skeleton::after {
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
  .header-accordion {
    min-height: 2.5rem;
    justify-content: flex-start;
    gap: 1rem;
  }
}
`,A=e`
:host {
  --_expandable-accordion-right-icon-color: var(--bbva-expandable-accordion--_ambient--right-icon-color,
      var(--bbva-expandable-accordion--custom--primary-ambient--right-icon-color,
          ${h("colorPrimaryLinkMainDefault",v)}));
  --_expandable-accordion-right-icon-pressed-color: var(--bbva-expandable-accordion--_ambient--right-icon-pressed-color,
      var(--bbva-expandable-accordion--custom--primary-ambient--right-icon-pressed-color,
          ${h("colorPrimaryLinkMainPressed",v)}));
  --_expandable-accordion-header-bg-color-pressed: var(--bbva-expandable-accordion--_ambient--header-bg-color-pressed,
      var(--bbva-expandable-accordion--custom--primary-ambient--header-bg-color-pressed,
          ${h("colorPrimarySurfaceAmbientPressed",v)}));
  --_expandable-accordion-focus-border-color: var(--bbva-expandable-accordion--_ambient--focus-border-color,
      var(--bbva-expandable-accordion--custom--primary-ambient--focus-border-color,
              ${h("colorPrimarySurfaceAmbientFocus",v)}));
}
`;const w=e`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-expandable-accordion--_ambient--right-icon-color: initial;
    --bbva-expandable-accordion--_ambient--right-icon-pressed-color: initial;
    --bbva-expandable-accordion--_ambient--header-bg-color-pressed: initial;
    --bbva-expandable-accordion--_ambient--focus-border-color: initial;
  }
`,P=e`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-expandable-accordion--_ambient--right-icon-color: var(
      --bbva-expandable-accordion--custom--primary-alt-ambient--right-icon-color,
      ${h("colorPrimaryAltLinkMainDefault",v)}
    );
    --bbva-expandable-accordion--_ambient--right-icon-pressed-color: var(
      --bbva-expandable-accordion--custom--primary-alt-ambient--right-icon-pressed-color,
      ${h("colorPrimaryAltLinkMainPressed",v)}
    );
    --bbva-expandable-accordion--_ambient--header-bg-color-pressed: var(
      --bbva-expandable-accordion--custom--primary-alt-ambient--header-bg-color-pressed,
      ${h("colorPrimaryAltSurfaceAmbientPressed",v)}
    );
    --bbva-expandable-accordion--_ambient--focus-border-color: var(
      --bbva-expandable-accordion--custom--primary-alt-ambient--focus-border-color,
      ${h("colorPrimaryAltSurfaceAmbientFocus",v)}
    );
  }
`,z=e`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-expandable-accordion--_ambient--right-icon-color: var(
      --bbva-expandable-accordion--custom--secondary-ambient--right-icon-color,
      ${h("colorSecondaryLinkMainDefault",v)}
    );
    --bbva-expandable-accordion--_ambient--right-icon-pressed-color: var(
      --bbva-expandable-accordion--custom--secondary-ambient--right-icon-pressed-color,
      ${h("colorSecondaryLinkMainPressed",v)}
    );
    --bbva-expandable-accordion--_ambient--header-bg-color-pressed: var(
      --bbva-expandable-accordion--custom--secondary-ambient--header-bg-color-pressed,
      ${h("colorSecondarySurfaceAmbientPressed",v)}
    );
    --bbva-expandable-accordion--_ambient--focus-border-color: var(
      --bbva-expandable-accordion--custom--secondary-ambient--focus-border-color,
      ${h("colorSecondarySurfaceAmbientFocus",v)}
    );
  }
`,I=e`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-expandable-accordion--_ambient--right-icon-color: var(
      --bbva-expandable-accordion--custom--secondary-alt-ambient--right-icon-color,
      ${h("colorSecondaryAltLinkMainDefault",v)}
    );
    --bbva-expandable-accordion--_ambient--right-icon-pressed-color: var(
      --bbva-expandable-accordion--custom--secondary-alt-ambient--right-icon-pressed-color,
      ${h("colorSecondaryAltLinkMainPressed",v)}
    );
    --bbva-expandable-accordion--_ambient--header-bg-color-pressed: var(
      --bbva-expandable-accordion--custom--secondary-alt-ambient--header-bg-color-pressed,
      ${h("colorSecondaryAltSurfaceAmbientPressed",v)}
    );
    --bbva-expandable-accordion--_ambient--focus-border-color: var(
      --bbva-expandable-accordion--custom--secondary-alt-ambient--focus-border-color,
      ${h("colorSecondaryAltSurfaceAmbientFocus",v)}
    );
  }
`;const L=g([Object.freeze({__proto__:null,primary:w,primaryAlt:P,secondary:z,secondaryAlt:I}),u,y]),j=Object.values(L);class E extends(f(t(k(i(x(n)))))){static get is(){return"bbva-expandable-accordion"}static get scopedElements(){return{"bbva-core-collapse":c,"bbva-type-icon":_,"bbva-divider-default":$,"bbva-core-heading":d}}static get properties(){return{icon:{type:String},openIcon:{type:String,attribute:"open-icon"},closeIcon:{type:String,attribute:"close-icon"},stateIconSize:{type:Number,attribute:"state-icon-size"},_uniqueId:{type:Number},opened:{type:Boolean,reflect:!0},loading:{type:Boolean,reflect:!0},divider:{type:String},headingLevel:{type:Number,attribute:"heading-level"}}}constructor(){super(),this.openIcon=s(),this.closeIcon=l(),this.stateIconSize=24,this.opened=!1,this._uniqueId=Math.floor(Math.random()*Date.now()),this.loading=!1,this.divider="",this.headingLevel=3}static get styles(){return[super.styles,b("bbva-global-dividers-shared-styles"),S,b("bbva-expandable-accordion-shared-styles"),A,j]}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)"}}connectedCallback(){var e;null===(e=super.connectedCallback)||void 0===e||e.call(this),this.addEventListener("keypressed",this._onKeypressed)}disconnectedCallback(){var e;null===(e=super.disconnectedCallback)||void 0===e||e.call(this),this.removeEventListener("keypressed",this._onKeypressed)}_onKeypressed(e){"Enter"!==e.code&&"Space"!==e.code||(this.opened=!this.opened)}updated(e){var a;null===(a=super.updated)||void 0===a||a.call(this,e),e.has("loading")&&(this.loading?this.setAttribute("tabindex","-1"):this.removeAttribute("tabindex")),e.has("disabled")&&this.disabled&&this.setAttribute("tabindex","-1"),e.has("opened")&&this.dispatchEvent(new CustomEvent("expandable-accordion-open-change",{detail:this.opened,bubbles:!0,composed:!0}))}_onHeaderClick(){this.opened=!this.opened,this.dispatchEvent(new CustomEvent("expandable-accordion-header-click",{detail:this.opened,bubbles:!0,composed:!0}))}get _renderDivider(){return p`
      ${this.divider?p`<bbva-divider-default size="${this.divider}"></bbva-divider-default>`:p``}
    `}render(){const e=p`<bbva-type-icon
      .icon="${this.opened?this.closeIcon:this.openIcon}"
      .size="${this.stateIconSize}"
      class="right-icon ${m({desktop:this._desktop})}"
    ></bbva-type-icon>`;return p`
      ${this.loading?p`
            <div class="skeleton"></div>
            ${this._renderDivider}
          `:p`<bbva-core-heading
              aria-labelledby="header"
              class="header"
              level="${this.headingLevel}"
            >
              <button
                class="header-accordion"
                aria-controls="${this._uniqueId}"
                aria-expanded="${this.opened}"
                @click="${this._onHeaderClick}"
                aria-labelledby="header"
              >
                ${this._desktop?e:""}
                <slot name="header" id="header"></slot>
                ${this._desktop?"":e}
              </button>
            </bbva-core-heading>

            <bbva-core-collapse
              data-tag-name="bbva-core-collapse"
              id="${this._uniqueId}"
              ?opened="${this.opened}"
              data-id="collapse"
            >
              <slot name="content"></slot>
            </bbva-core-collapse>
            ${this._renderDivider}`}
    `}}export{E as B,L as b};
