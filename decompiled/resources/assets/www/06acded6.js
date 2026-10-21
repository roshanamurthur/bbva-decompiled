import{H as e,z as t,a8 as a,ab as i,ad as r,ar as n,a9 as o,aa as l,b0 as s,aJ as c,a as d,ap as p,L as g,bj as h,b6 as b,ag as m,ak as v,h as u,av as x,aW as y,i as k,f,o as S,g as $}from"./952f98a9.js";const L=e((e=>class extends e{static get properties(){return{host:{type:String,attribute:"host"},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"},language:{type:String},headers:{type:Object},ambient:{type:String,reflect:!0},locale:{type:String},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},publicSettingsHost:{type:String,attribute:"public-settings-host"},publicSettingsRequiredToken:{type:String,attribute:"public-settings-required-token"},history:{type:Object}}}constructor(){super(),this.native=!1,this.iOSFixedHeader=!1,this.publicSettingsRequiredToken="none"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("help-modal-open",this._handleModalState),this.addEventListener("help-modal-close",this._handleModalState),this.setAttribute("data-tag-name",this.constructor.is)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("help-modal-open",this._handleModalState),this.removeEventListener("help-modal-close",this._handleModalState)}static scopedElementsFromClasses(e){return e.reduce(((e,t)=>(e[t.is]=t,e)),{})}_handleModalState(e){var t;const a=null==e||null===(t=e.detail)||void 0===t?void 0:t.modal;this.dispatchEvent(new CustomEvent("modal-state-change",{bubbles:!0,composed:!0,detail:{visible:null==a?void 0:a.visible,modal:a}}))}})),_=new n;var C=t`:host {
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
  text-align: center;
  position: relative;
  --_panel-info-title-color: var(--bbva-panel-info-title-dark-mode-color, var(--bbva-panel-info-title-color, var(--colorsSecondary600, ${a(o.secondary600)})));
  --_panel-info-text-color: var(--bbva-panel-info-text-dark-mode-color, var(--bbva-panel-info-text-color, var(--colorsSecondary600, ${a(o.secondary600)})));
  --bbva-text-highlight-color: var(--bbva-panel-info-text-highlight-dark-mode-color, var(--bbva-panel-info-text-highlight-color, var(--colorsSecondary600, ${a(o.secondary600)})));
  --_skeleton-quote-color: var(--bbva-panel-info-skeleton-dark-mode-color, var(--bbva-panel-info-skeleton-color, var(--colorsSecondary200, ${a(o.secondary200)})));
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

.image {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1em) auto;
}
.image img {
  width: var(--bbva-panel-info-image-width, 100%);
  height: var(--bbva-panel-info-image-height, auto);
  object-fit: cover;
  margin: 0 auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
}
.image span {
  display: block;
  width: var(--bbva-panel-info-microillustration-width, 5rem);
  height: var(--bbva-panel-info-microillustration-height, auto);
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem) auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
}
.image span.empty-state {
  width: 9rem;
}

.content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1em);
}

:host([hide-padding-bottom]) .content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1em) 0;
}

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
  color: var(--_panel-info-title-color);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${a(i.medium.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${a(r.typeLarge)});
}
.title.not-text {
  margin-bottom: 0;
}

.description {
  margin: 0 auto;
  color: var(--_panel-info-text-color);
}

[data-tag-name=bbva-link] {
  display: inline-block;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
}
[data-tag-name=bbva-link][disabled] {
  opacity: 1;
}

:host([loading][microillustration]):before {
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg, transparent);
  background-size: 144px 144px, calc((44% * 2) + (16px/ 2)) 16px, calc((75% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px;
  background-position: 50% 8px, 283% 168px, -20% 200px, 92% 232px;
}

:host([loading][image]):before {
  margin-top: 0;
  min-height: 17.5rem;
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg, transparent);
  background-size: 100% 152px, calc((44% * 2) + (16px/ 2)) 16px, calc((75% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px;
  background-position: 50% 0px, 283% 172px, -20% 204px, 92% 236px;
}

:host([loading][microillustration]):before,
:host([loading][image]):before {
  content: "";
  position: absolute;
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  min-height: 18.5rem;
  display: inline-block;
  pointer-events: none;
  background-repeat: no-repeat;
  font-size: 1em;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
}
:host([loading][microillustration]) > :nth-child(n),
:host([loading][image]) > :nth-child(n) {
  opacity: 0;
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  50% {
    filter: opacity(60%);
  }
  100% {
    filter: opacity(100%);
  }
}
${_.mediaRules()}`;var q=t`[ambient^=light] {
  --bbva-panel-info-title-color: initial;
  --bbva-panel-info-text-color: initial;
  --bbva-panel-info-text-highlight-color: initial;
  --bbva-panel-info-skeleton-color: initial;
}
${(new n).mediaRules()}`;const T=new n;var E=t`[ambient^=dark] {
  --bbva-panel-info-title-color: var(--colorsPrimaryCoreLightened, ${a(o.primaryCoreLightened)});
  --bbva-panel-info-text-color: var(--colorsPrimaryCoreLightened, ${a(o.primaryCoreLightened)});
  --bbva-panel-info-text-highlight-color: var(--colorsPrimaryCoreLightened, ${a(o.primaryCoreLightened)});
  --bbva-panel-info-skeleton-color: var(--colorsPrimaryMedium, ${a(o.primaryMedium)});
}
${T.mediaRules()}`;const w={light:t`
    ${s.light}
    ${q}
  `,dark:t`
    ${s.dark}
    ${E}
  `};class V extends(c(d(p(g)))){static get is(){return"bbva-panel-info"}static get scopedElements(){return{"bbva-core-heading":h,"bbva-link":b,"bbva-text":m}}static get properties(){return{image:{type:String},imageAltText:{type:String,attribute:"image-alt-text"},microillustration:{type:String},heading:{type:String},headingLines:{type:Number,attribute:"heading-lines"},text:{type:String},textLines:{type:Number,attribute:"text-lines"},linkText:{type:String,attribute:"link-text"},loading:{type:Boolean,reflect:!0},headingLevelTitle:{type:String,attribute:"heading-level-title",reflect:!0},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom",reflect:!0},isNested:{type:Boolean,attribute:"is-nested"}}}constructor(){super(),this.imageAltText="",this.microillustration="emptystateday",this.text="",this.loading=!1,this.headingLevelTitle="h2",this.hidePaddingBottom=!1,this.isNested=!1}static get styles(){return[C,super.styles,v("bbva-panel-info-shared-styles"),w.light,w.dark]}get _contentImage(){return this.image?u` <img id="image" src="${this.image}" alt="${this.imageAltText}" /> `:u`
      <span
        class="${x({"empty-state":this._isEmptyState&&!this.isNested})}"
        aria-hidden="true"
        >${y[this.microillustration]}</span
      >
    `}get _isEmptyState(){return"emptystateday"===this.microillustration}render(){return u`
      <div class="image">${this._contentImage}</div>
      <div class="content">
        ${this.heading&&u`
          <bbva-text
            tabindex="0"
            class="title ${x({"not-text":!this.text})}"
            text=${this.heading}
            size="L"
            alignment="center"
            tag="${k(this.headingLevelTitle)}"
            ?ellipsis="${!!this.headingLines}"
            .lines="${this.headingLines}"
            inherit
          ></bbva-text>
        `}
        ${this.text&&u`
          <bbva-text
            tabindex="0"
            class="description"
            text=${this.text}
            ?hidden="${!this.text}"
            size="S"
            alignment="center"
            ?ellipsis="${!!this.textLines}"
            .lines="${this.textLines}"
            inherit
          ></bbva-text>
        `}
        ${this.linkText&&u`
          <bbva-link
            ?disabled=${this.disabled}
            @click="${this._buttonClickHandler}"
            .text="${this.linkText}"
          ></bbva-link>
        `}
      </div>
    `}_buttonClickHandler(){this.disabled||this.dispatchEvent(new CustomEvent("panel-info-link-click",{detail:!0,bubbles:!0,composed:!0}))}}$("colors.primaryCoreLightened"),$("colors.primaryCoreLightened"),$("colors.primaryCoreLightened"),$("colors.cool50");export{L as B,V as a};
