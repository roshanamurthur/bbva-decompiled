import"./51384888.js";import"./216055dc.js";import"./7f3d7ca9.js";import"./f093134b.js";import{z as t,a8 as e,ac as a,ad as r,ab as i,ar as o,a9 as n,aa as s,a as l,aS as d,aJ as c,L as p,aw as g,ag as m,ak as h,au as b,h as v}from"./952f98a9.js";import"./b24c6aae.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./4db9c762.js";import"./a845c78d.js";import"./055a082b.js";const u=new o;var k=t`:host {
  --_text-color: var(--bbva-panel-comparative-text-dark-mode-color, var(--bbva-panel-comparative-text-color, var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)})));
  --_text-highlight-color: var(--bbva-panel-comparative-text-highlight-color, token("foundations.colors.secondary600"));
  --_background-color-primary: var(--bbva-panel-comparative-background-dark-mode-color-primary, var(--bbva-panel-comparative-background-color-primary, var(--colorsPrimaryCore, ${e(n.primaryCore)})));
  --_background-color-secondary: var(--bbva-panel-comparative-background-dark-mode-color-secondary, var(--bbva-panel-comparative-background-color-secondary, var(--colorsPrimaryCoreLight, ${e(n.primaryCoreLight)})));
  --_skeleton-quote-color: var(--bbva-panel-comparative-dark-mode-skeleton-color, var(--bbva-panel-comparative-skeleton-color, var(--colorsSecondary300, ${e(n.secondary300)})));
  --_skeleton-quote-bg: var(--bbva-panel-comparative-dark-mode-skeleton-bg-color, var(--bbva-panel-comparative-skeleton-bg-color, var(--colorsSecondary200, ${e(n.secondary200)})));
  --_skeleton-animated-layer-bg: var(--bbva-panel-comparative-dark-mode-skeleton-animated-layer-bg-color, var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)}));
  --_skeleton-quote-bg-trasparent: transparent;
  display: block;
  box-sizing: border-box;
  font-size: var(--typographyTypeSmall, ${e(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(r.typeSmall)});
  color: var(--_text-color);
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

.content {
  display: flex;
  flex-direction: column;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
}

.portrait {
  min-height: 7.5rem;
  background-color: var(--_background-color-primary);
  background-image: linear-gradient(-5deg, var(--_background-color-secondary) 50%, var(--_background-color-primary) 50%);
}
.portrait .content:first-child {
  padding-bottom: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
}
.portrait .content:last-child {
  padding-top: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
}
.portrait [data-id=amount] {
  margin-top: 0.25rem;
}

[data-tag-name=bbva-text] {
  color: var(--_text-color);
  overflow: hidden;
  font-size: var(--typographyTypeSmall, ${e(a.typeSmall)});
  line-height: var(--lineHeightTypeMedium, ${e(r.typeMedium)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(i.medium.fontStyle)});
  --bbva-text-highlight-color: var(--_text-highlight-color);
}
[data-tag-name=bbva-text][data-id=title] {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(i.medium.fontWeight)});
}
[data-tag-name=bbva-text].content-text {
  display: inline-grid;
}

.landscape {
  background-color: var(--_background-color-primary);
  background-image: linear-gradient(95deg, var(--_background-color-primary) 50%, var(--_background-color-secondary) 50%);
  display: flex;
  justify-content: space-around;
  border-radius: 1px;
}
.landscape [data-tag-name=bbva-text][data-id=title], .landscape [data-tag-name=bbva-text] [data-id=description] {
  width: 7.5rem;
}
@media (min-width: 600px) {
  .landscape [data-tag-name=bbva-text][data-id=title], .landscape [data-tag-name=bbva-text] [data-id=description] {
    width: 20.625rem;
  }
}
@media (min-width: 900px) {
  .landscape [data-tag-name=bbva-text][data-id=title], .landscape [data-tag-name=bbva-text] [data-id=description] {
    width: 28.125rem;
  }
}
.landscape [data-id=amount] {
  margin-top: 0.5rem;
  margin-bottom: 0.5rem;
}

.right [data-id=title], .right [data-id=description] {
  text-align: right;
}
.right [data-id=description][ellipsis] {
  position: relative;
}
.right [data-id=description][ellipsis]::after {
  content: "...";
  position: absolute;
  right: 0;
  bottom: 0;
  background-color: var(--_background-color-secondary);
  padding-left: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1em);
}

.right-amount {
  display: flex;
  justify-content: end;
}

.center {
  width: 100%;
  text-align: center;
  align-items: center;
}

.portrait-positive {
  position: absolute;
  top: 0;
  left: 0;
  overflow: hidden;
  opacity: 1;
  width: 100%;
  height: 65px;
  pointer-events: none;
  background-repeat: no-repeat;
  background-image: linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: transparent;
  background-size: calc((32% * 2) + (16px/ 2)) 16px, calc((80% * 2) + (16px/ 2)) 16px;
  background-position: 16px 16px, 16px 48px;
}
.portrait-positive .skeleton-portrait {
  background-color: var(--_skeleton-quote-bg);
}

.portrait-negative {
  position: absolute;
  bottom: 16px;
  right: 0;
  overflow: hidden;
  opacity: 1;
  width: 100%;
  height: 65px;
  pointer-events: none;
  background-repeat: no-repeat;
  background-image: linear-gradient(-60deg, var(--_skeleton-quote-bg) 50%, transparent 50%), linear-gradient(-60deg, var(--_skeleton-quote-bg) 50%, transparent 50%);
  background-color: transparent;
  background-size: calc((32% * 2) + (16px/ 2)) 16px, calc((80% * 2) + (16px/ 2)) 16px;
  background-position: 87px 16px, -220px 48px;
}
.portrait-negative .skeleton-portrait {
  background-color: var(--_skeleton-quote-color);
}

.landscape-positive {
  position: absolute;
  top: 0;
  left: 0;
  width: 45%;
  overflow: hidden;
  opacity: 1;
  height: 100%;
  pointer-events: none;
  background-repeat: no-repeat;
  background-image: linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: transparent;
  background-size: calc((80% * 2) + (16px/ 2)) 16px, calc((57% * 2) + (16px/ 2)) 16px;
  background-position: 16px 36px, 32px 67px;
}
.landscape-positive .skeleton-landscape {
  background-color: var(--_skeleton-quote-bg);
}

.landscape-negative {
  position: absolute;
  top: 0%;
  right: 0%;
  height: 100%;
  width: 45%;
  overflow: hidden;
  pointer-events: none;
  background-repeat: no-repeat;
  background-image: linear-gradient(-60deg, var(--_skeleton-quote-bg) 50%, transparent 50%), linear-gradient(-60deg, var(--_skeleton-quote-bg) 50%, transparent 50%);
  background-color: transparent;
  background-size: calc((57% * 2) + (16px/ 2)) 16px, calc((80% * 2) + (16px/ 2)) 16px;
  background-position: calc(100% + -32px) 36px, calc(100% + -16px) 67px;
}
.landscape-negative .skeleton-landscape {
  background-color: var(--_skeleton-quote-color);
}

:host([loading]) {
  position: relative;
  pointer-events: none;
  background-repeat: no-repeat;
  overflow: hidden;
  opacity: 1;
  height: 7.5rem;
  background-color: var(--_skeleton-quote-bg);
  background-image: linear-gradient(105deg, var(--_skeleton-quote-bg) 50%, var(--_skeleton-quote-color) 50%);
}
:host([loading]) .skeleton-landscape {
  transform-origin: right bottom;
  transform: translateX(200%) scaleX(1);
  left: 6.25rem;
  height: 100%;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  z-index: 1;
}
:host([loading]):host([portrait]) {
  height: 13.75rem;
  background-color: var(--_skeleton-quote-bg);
  background-image: linear-gradient(-5deg, var(--_skeleton-quote-color) 50%, var(--_skeleton-quote-bg) 50%);
}
:host([loading]):host([portrait]) .skeleton-portrait {
  transform-origin: right bottom;
  height: 100%;
  transform: translateX(200%) scaleX(1);
  left: 6.25rem;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  z-index: 1;
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
${u.mediaRules()}`;class y extends(l(d(c(p)))){static get is(){return"bbva-panel-comparative"}static get scopedElements(){return{"bbva-amount":g,"bbva-text":m}}static get properties(){return{title:{type:Boolean},firstTitle:{type:String,attribute:"first-title"},secondTitle:{type:String,attribute:"second-title"},firstDescription:{type:String,attribute:"first-description"},secondDescription:{type:String,attribute:"second-description"},portrait:{type:Boolean},firstAmount:{type:Number,attribute:"first-amount"},secondAmount:{type:Number,attribute:"second-amount"},headingLevel:{type:Number,attribute:"heading-level"},showDecimals:{type:Boolean,attribute:"show-decimals"},loading:{type:Boolean,reflect:!1},titleEllipsis:{type:Boolean,attribute:"title-ellipsis",reflect:!0},descriptionEllipsis:{type:String,attribute:"description-ellipsis"}}}static get styles(){return[super.styles,k,h("bbva-panel-comparative-shared-styles"),b.dark]}constructor(){super(),this.showDecimals=!1,this.loading=!1,this.titleEllipsis=!1}get _hasBothTitles(){return this.firstTitle&&this.secondTitle}get _hasBothDescriptions(){return this.firstDescription&&this.secondDescription}get _hasBothAmounts(){return(this.firstAmount||0===this.firstAmount)&&(this.secondAmount||0===this.secondAmount)}_title(t,e){return v`
      ${this._hasBothTitles&&v`<bbva-text
        data-id="title"
        .text=${t}
        tag="h2"
        ?ellipsis=${e}
        unset
        alignment=${this.portrait?"left":"center"}
      ></bbva-text>`}
    `}_description({description:t,ellipsis:e,lines:a}){return v`
      ${this._hasBothDescriptions&&v`<bbva-text
        data-id="description"
        .text=${t}
        ?ellipsis=${e}
        .lines=${a}
        unset
        alignment=${this.portrait?"left":"center"}
      ></bbva-text>`}
    `}_amount(t,e,a,r,i){return v` ${this._hasBothAmounts?v`<bbva-amount
          data-id="amount"
          ambient="dark"
          ?decimals-hidden="${!t}"
          variant="xl"
          .localCurrency="${e}"
          .amount="${a}"
          .currencyCode="${r}"
          .language="${i}"
        >
        </bbva-amount>`:""}`}get _renderPanels(){return v`
      <div class="${this.portrait?"portrait":"landscape"}">
        <div class="content ${this.portrait?"":"center"}">
          ${this.firstTitle&&this._title(this.firstTitle,this.titleEllipsis)}
          ${this.firstAmount||0===this.firstAmount?this._amount(this.showDecimals,this.localCurrency,this.firstAmount,this.currencyCode,this.language):""}
          ${this.firstDescription&&this._description({description:this.firstDescription,ellipsis:this.descriptionEllipsis,lines:this.descriptionEllipsis})}
        </div>
        <div class="content ${this.portrait?"right":"center"}">
          ${this.secondTitle&&this._title(this.secondTitle,this.titleEllipsis)}
          ${this.secondAmount||0===this.secondAmount?v`<div class="${this.portrait&&"right-amount"}">
                ${this._amount(this.showDecimals,this.localCurrency,this.secondAmount,this.currencyCode,this.language)}
              </div>`:""}
          ${this.secondDescription&&this._description({description:this.secondDescription,ellipsis:this.descriptionEllipsis,lines:this.descriptionEllipsis})}
        </div>
      </div>
    `}get _renderSkeleton(){return v`
      ${this.portrait?v`<div class="portrait-positive"><div class="skeleton-portrait"></div></div>
            <div class="portrait-negative"><div class="skeleton-portrait"></div></div>`:v` <div class="landscape-positive">
              <div class="skeleton-landscape"></div>
            </div>
            <div class="landscape-negative">
              <div class="skeleton-landscape"></div>
            </div>`}
    `}render(){return this.loading?v`${this._renderSkeleton}`:v`${this._renderPanels}`}}customElements.define(y.is,y);
