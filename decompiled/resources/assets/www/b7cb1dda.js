import{z as t,a8 as e,ac as a,ad as i,ab as r,aS as o,L as s,ak as n,h as l}from"./952f98a9.js";import{R as d,S as c,u as p,D as m,a1 as b,E as h,v as u,w as v,W as y,G as g,a2 as f,I as k}from"./216055dc.js";var _=t`
:host {
  --_panel-comparative-landscape-divider-color:
    var(--bbva-panel-comparative--_ambient--landscape-divider-color,
      var(--bbva-panel-comparative--custom--primary-ambient--landscape-divider-color,
        ${d("colorPrimaryFormatDivider",c)}));
}
`;const x=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-panel-comparative--_ambient--landscape-divider-color: initial;
  }
`,$=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-panel-comparative--_ambient--landscape-divider-color: var(
      --bbva-panel-comparative--custom--primary-alt-ambient--landscape-divider-color,
      ${d("colorPrimaryAltFormatDivider",c)}
    );
  }
`,T=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-panel-comparative--_ambient--landscape-divider-color: var(
      --bbva-panel-comparative--custom--secondary-ambient--landscape-divider-color,
      ${d("colorSecondaryFormatDivider",c)}
    );
  }
`,A=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-panel-comparative--_ambient--landscape-divider-color: var(
      --bbva-panel-comparative--custom--secondary-alt-ambient--landscape-divider-color,
      ${d("colorSecondaryAltFormatDivider",c)}
    );
  }
`;const S=p([Object.freeze({__proto__:null,primary:x,primaryAlt:$,secondary:T,secondaryAlt:A}),m,b,h]),D=Object.values(S);var w=t`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

:host {
  display: block;
  box-sizing: border-box;
  font-size: var(--typographyTypeSmall, ${e(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(i.typeSmall)});
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
  width: calc(50% - 1rem);
}
:host([portrait]) .content {
  width: 100%;
}
.content [data-id=amount] {
  margin-top: 0.5rem;
  margin-bottom: 0.5rem;
}

[data-tag-name=bbva-type-text] {
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(r.medium.fontStyle)});
  line-height: var(--lineHeightTypeMedium, ${e(i.typeMedium)});
}
[data-tag-name=bbva-type-text][data-id=title] {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(r.medium.fontWeight)});
}
[data-tag-name=bbva-type-text].content-text {
  display: inline-grid;
}

.landscape {
  display: flex;
  justify-content: flex-start;
}

[data-tag-name=bbva-divider-default] {
  display: block;
  margin: 1rem 0;
}

.landscape-divider {
  width: 0.0625rem;
  border-left: 0.0625rem solid var(--_panel-comparative-landscape-divider-color);
  margin: 0 1rem;
}

[class^=portrait-skeleton-] {
  width: 100%;
  height: 5rem;
  background-color: var(--_skeleton-default-bg-color);
  mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%);
  mask-position: 0px 0px, 0px 32px, 0px 64px;
  mask-repeat: no-repeat;
  mask-size: calc((20% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px, calc((75% * 2) + (16px/ 2)) 16px;
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
[class^=portrait-skeleton-]::after {
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

[class^=landscape-skeleton-] {
  width: 48%;
  height: 100%;
  background-color: var(--_skeleton-default-bg-color);
  mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%);
  mask-position: 0px 0px, 0px 32px, 0px 64px;
  mask-repeat: no-repeat;
  mask-size: calc((30% * 2) + (16px/ 2)) 16px, calc((45% * 2) + (16px/ 2)) 16px, calc((70% * 2) + (16px/ 2)) 16px;
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
[class^=landscape-skeleton-]::after {
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

:host([loading]) {
  display: flex;
  overflow: hidden;
  height: 6.25rem;
  justify-content: flex-start;
  padding: 0;
}
:host([loading]):host([portrait]) {
  display: block;
  height: 13.75rem;
}
`;class z extends(u(o(v(y(s))))){static get is(){return"bbva-panel-comparative"}static get scopedElements(){return{"bbva-type-text":g,"bbva-type-amount":f,"bbva-divider-default":k}}static get properties(){return{firstTitle:{type:String,attribute:"first-title"},firstTitleLinesEllipsis:{type:Number,attribute:"first-title-lines-ellipsis"},secondTitle:{type:String,attribute:"second-title"},secondTitleLinesEllipsis:{type:Number,attribute:"second-title-lines-ellipsis"},firstDescription:{type:String,attribute:"first-description"},titleSize:{type:String,attribute:"title-size"},secondDescription:{type:String,attribute:"second-description"},portrait:{type:Boolean},firstAmount:{type:Number,attribute:"first-amount"},secondAmount:{type:Number,attribute:"second-amount"},headingLevel:{type:String,attribute:"heading-level"},showDecimals:{type:Boolean,attribute:"show-decimals"},loading:{type:Boolean,reflect:!1},_desktop:{type:Boolean,attribute:!1},amountType:{type:String,attribute:"amount-type"},amountText:{type:String,attribute:"amount-text"},discreetMode:{type:Boolean,attribute:"discreet-mode",state:!0}}}static get styles(){return[super.styles,_,w,D,n("bbva-panel-comparative-shared-styles")]}constructor(){super(),this._desktop=!1,this.portrait=!1,this.showDecimals=!1,this.loading=!1,this.discreetMode=!1,this.headingLevel="h2",this.firstTitleLinesEllipsis=1,this.secondTitleLinesEllipsis=1,this.titleSize="L",this.amountType="",this.amountText=""}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)"}}get _hasBothTitles(){return this.firstTitle&&this.secondTitle}get _hasBothDescriptions(){return this.firstDescription&&this.secondDescription}get _hasBothAmounts(){return(this.firstAmount||0===this.firstAmount)&&(this.secondAmount||0===this.secondAmount)}_sizeDesktop(){return"L"===this.titleSize?"M":this.titleSize}_title(t,e){return l`
      ${this._hasBothTitles&&l`<bbva-type-text
        data-id="title"
        .text=${t}
        tag="${this.headingLevel}"
        ellipsis
        .lines="${e}"
        unset
        size="${this._desktop?this._sizeDesktop():this.titleSize}"
      ></bbva-type-text>`}
    `}_description(t){return l`
      ${this._hasBothDescriptions&&l`<bbva-type-text
        data-id="description"
        .text=${t}
        ellipsis
        lines="2"
        unset
        size="S"
      ></bbva-type-text>`}
    `}_amount(t,e,a,i,r,o,s){return l` ${this._hasBothAmounts?l`<bbva-type-amount
          data-id="amount"
          ?decimals-hidden="${!t}"
          variant="l"
          .localCurrency="${e}"
          .amount="${a}"
          .currencyCode="${i}"
          .language="${r}"
          .type="${o}"
          .text="${s}"
          ?mask="${this.discreetMode}"
        >
        </bbva-type-amount>`:""}`}get _renderPanels(){return l`
      <div class="${this.portrait?"portrait":"landscape"}">
        <div class="content">
          ${this.firstTitle&&this._title(this.firstTitle,this.firstTitleLinesEllipsis)}
          ${this.firstAmount||0===this.firstAmount?this._amount(this.showDecimals,this.localCurrency,this.firstAmount,this.currencyCode,this.language,this.amountType,this.amountText):""}
          ${this.firstDescription&&this._description(this.firstDescription)}
        </div>
        <bbva-divider-default
          class="${this.portrait?"":"landscape-divider"}"
        ></bbva-divider-default>
        <div class="content">
          ${this.secondTitle&&this._title(this.secondTitle,this.secondTitleLinesEllipsis)}
          ${this.secondAmount||0===this.secondAmount?l`<div class="${this.portrait&&"right-amount"}">
                ${this._amount(this.showDecimals,this.localCurrency,this.secondAmount,this.currencyCode,this.language,this.amountType,this.amountText)}
              </div>`:""}
          ${this.secondDescription&&this._description(this.secondDescription)}
        </div>
      </div>
    `}get _renderSkeleton(){return l`
      ${this.portrait?l`<div class="portrait-skeleton-1"></div>
            <bbva-divider-default size="fit"></bbva-divider-default>
            <div class="portrait-skeleton-2"></div>`:l` <div class="landscape-skeleton-1"></div>
            <bbva-divider-default class="landscape-divider"></bbva-divider-default>
            <div class="landscape-skeleton-2"></div>`}
    `}render(){return this.loading?l`${this._renderSkeleton}`:l`${this._renderPanels}`}}export{z as B,S as b};
