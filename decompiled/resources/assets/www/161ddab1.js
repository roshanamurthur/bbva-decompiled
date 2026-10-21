import{z as a,a8 as t,ab as r,a9 as e,an as i,aS as o,L as l,ak as n,h as s,i as b,bl as c,aV as m,av as d}from"./952f98a9.js";import{R as u,S as v,u as p,D as g,a1 as h,v as y,w as f,G as k,a2 as z}from"./216055dc.js";var _=a`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

:host {
  position: relative;
  z-index: var(--_data-visualization-bar-z-index);
  display: block;
  width: var(--bbva-data-visualization-bar-width, 100%);
  box-sizing: border-box;
  font-weight: var(--fontFacePrimaryBookFontWeight, ${t(r.book.fontWeight)});
  --_data-visualization-bar-z-index: var(--bbva-data-visualization-bar-z-index, 0);
  --_z-index: var(--bbva-data-visualization-bar-mark-z-index, 1);
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
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.header-title {
  display: flex;
  overflow: hidden;
  align-items: center;
  padding-right: 1rem;
}
.header-title .header-text {
  overflow: hidden;
  padding: 0;
  border: none;
  margin: 0;
  background: none;
}
.header-title .title-medium {
  font-style: var(--fontFacePrimaryMediumFontStyle, ${t(r.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${t(r.medium.fontWeight)});
}

.progress-bar,
.progress-bar-any-colors {
  position: relative;
  z-index: var(--bbva-z-index-back-layer, 1);
  display: block;
  overflow: hidden;
  height: var(--bbva-data-visualization-bar-height, 0.75rem);
  background-color: var(--_data-visualization-bar-bg-color);
  transform: skew(-27deg);
}

.progress-bar-fill {
  display: block;
  width: 100%;
  height: var(--bbva-data-visualization-bar-height, 0.75rem);
  background-color: var(--_data-visualization-bar-color);
  transition: transform var(--bbva-fast-transition, 0.2s) ease-in-out;
  will-change: transform;
}

.progress-bar-any-colors {
  display: flex;
  align-items: center;
}
.progress-bar-any-colors > * {
  display: block;
  height: var(--bbva-data-visualization-bar-height, 0.75rem);
}

.shadow {
  position: relative;
  bottom: calc(var(--bbva-global-spacer, 0.375rem));
  left: calc(var(--bbva-data-visualization-bar-height, 0.75rem) / 2 * -1);
  display: block;
  width: 100%;
  height: var(--bbva-data-visualization-bar-height, 0.375rem);
  background: linear-gradient(to bottom, rgba(0, 0, 0, 0) 0%, rgb(0, 0, 0) 100%);
  opacity: 0.4;
  transform: skew(50deg);
}

.data-wrapper {
  position: relative;
}
.data-wrapper .mark {
  position: absolute;
  z-index: var(--_z-index);
  top: 0;
  bottom: 0;
  display: block;
  width: 0.125rem;
  height: var(--bbva-data-visualization-bar-height, 0.75rem);
  background-color: var(--_data-visualization-bar-mark-color);
  transform: skew(-27deg);
  will-change: transform;
}
.data-wrapper .middle {
  width: 0.25rem;
  background-color: var(--_data-visualization-bar-mark-middle-color);
}

:host([loading]) {
  overflow: hidden;
  height: 2rem;
  background-color: var(--_skeleton-default-bg-color);
  -webkit-mask-image: linear-gradient(-60deg, black 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, black 50%);
  mask-image: linear-gradient(-60deg, black 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, black 50%);
  -webkit-mask-position: 8px 8px, 0 8px;
  mask-position: 8px 8px, 0 8px;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: calc((0.8% * 2) + (12px/ 2)) 12px, calc((91% * 2) + (12px/ 2)) 12px;
  mask-size: calc((0.8% * 2) + (12px/ 2)) 12px, calc((91% * 2) + (12px/ 2)) 12px;
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
`,x=a`
:host {
  --_data-visualization-bar-color:
    var(--bbva-data-visualization-bar--_ambient--color,
      var(--bbva-data-visualization-bar--custom--primary-ambient--color,
        var(--colorsPrimaryMediumLight, ${t(e.primaryMediumLight)})));
  --_data-visualization-bar-bg-color:
    var(--bbva-data-visualization-bar--_ambient--bg-color,
      var(--bbva-data-visualization-bar--custom--primary-ambient--bg-color,
        ${u("colorPrimarySurfaceAlternativeDefault",v)}));
  --_data-visualization-bar-mark-color:
    var(--bbva-data-visualization-bar--_ambient--mark-color,
      var(--bbva-data-visualization-bar--custom--primary-ambient--mark-color,
        ${u("colorPrimarySurfaceAmbientDefault",v)}));
  --_data-visualization-bar-mark-middle-color:
    var(--bbva-data-visualization-bar--_ambient--mark-middle-color,
      var(--bbva-data-visualization-bar--custom--primary-ambient--mark-middle-color,
        ${u("colorPrimarySurfaceContrastDefault",v)}));
}
`;const $=a`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-data-visualization-bar--_ambient--color: initial;
    --bbva-data-visualization-bar--_ambient--bg-color: initial;
    --bbva-data-visualization-bar--_ambient--mark-color: initial;
    --bbva-data-visualization-bar--_ambient--mark-middle-color: initial;
  }
`,w=a`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-data-visualization-bar--_ambient--color: var(
      --bbva-data-visualization-bar--custom--primary-alt-ambient--color,
      ${t(e.primaryMediumLight)}
    );

    --bbva-data-visualization-bar--_ambient--bg-color: var(
      --bbva-data-visualization-bar--custom--primary-alt-ambient--bg-color,
      ${u("colorPrimaryAltSurfaceAlternativeDefault",v)}
    );

    --bbva-data-visualization-bar--_ambient--mark-color: var(
      --bbva-data-visualization-bar--custom--primary-alt-ambient--mark-color,
      ${u("colorPrimaryAltSurfaceAmbientDefault",v)}
    );

    --bbva-data-visualization-bar--_ambient--mark-middle-color: var(
      --bbva-data-visualization-bar--custom--primary-alt-ambient--mark-middle-color,
      ${u("colorPrimaryAltSurfaceContrastDefault",v)}
    );
  }
`,S=a`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-data-visualization-bar--_ambient--color: var(
      --bbva-data-visualization-bar--custom--secondary-ambient--color,
      ${t(e.primaryMediumLight)}
    );

    --bbva-data-visualization-bar--_ambient--bg-color: var(
      --bbva-data-visualization-bar--custom--secondary-ambient--bg-color,
      ${u("colorSecondarySurfaceAlternativeDefault",v)}
    );

    --bbva-data-visualization-bar--_ambient--mark-color: var(
      --bbva-data-visualization-bar--custom--secondary-ambient--mark-color,
      ${u("colorSecondarySurfaceAmbientDefault",v)}
    );

    --bbva-data-visualization-bar--_ambient--mark-middle-color: var(
      --bbva-data-visualization-bar--custom--secondary-ambient--mark-middle-color,
      ${u("colorSecondarySurfaceContrastDefault",v)}
    );
  }
`,A=a`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-data-visualization-bar--_ambient--color: var(
      --bbva-data-visualization-bar--custom--secondary-alt-ambient--color,
      ${t(e.primaryMediumLight)}
    );

    --bbva-data-visualization-bar--_ambient--bg-color: var(
      --bbva-data-visualization-bar--custom--secondary-alt-ambient--bg-color,
      ${u("colorSecondaryAltSurfaceAlternativeDefault",v)}
    );

    --bbva-data-visualization-bar--_ambient--mark-color: var(
      --bbva-data-visualization-bar--custom--secondary-alt-ambient--mark-color,
      ${u("colorSecondaryAltSurfaceAmbientDefault",v)}
    );

    --bbva-data-visualization-bar--_ambient--mark-middle-color: var(
      --bbva-data-visualization-bar--custom--secondary-alt-ambient--mark-middle-color,
      ${u("colorSecondaryAltSurfaceContrastDefault",v)}
    );
  }
`;const V=p([Object.freeze({__proto__:null,primary:$,primaryAlt:w,secondary:S,secondaryAlt:A}),g,h]),C=Object.values(V);class D extends(y(i(f(o(l))))){static get is(){return"bbva-data-visualization-bar"}static get scopedElements(){return{"bbva-type-text":k,"bbva-type-amount":z}}static get properties(){return{accessibilityText:{type:String,attribute:"accessibility-text"},maxValue:{type:Number,attribute:"max-value"},currentValue:{type:Number,attribute:"current-value"},markValue:{type:Number,attribute:"mark-value"},bgColor:{type:String},barValues:{type:Array},barAnyColors:{type:Boolean,attribute:"bar-any-colors"},progressBgColor:{type:String,attribute:"progress-bg-color"},fillColor:{type:String,attribute:"fill-color"},label:{type:String},titleMedium:{type:Boolean,attribute:"title-medium",reflect:!0},loading:{type:Boolean,reflect:!0},headingLevel:{type:String}}}constructor(){super(),this.maxValue=100,this.currentValue=0,this.barAnyColors=!1,this.bgColor="",this.markValue=null,this.progressBgColor="",this.titleMedium=!1,this.loading=!1,this.headingLevel="h3"}static get styles(){return[super.styles,x,_,C,n("bbva-data-visualization-bar-shared-styles")]}get _calcPercentage(){return this.currentValue>this.maxValue?100:Math.floor(100*this.currentValue/this.maxValue)}static get _shadow(){return s` <span class="shadow"></span> `}get _barAnyColors(){return s`
      ${this.barValues.length<=7?s`
            ${this.barValues.map((a=>s`
                  <span
                    aria-label="${b(this.t(a.accessibilityLabel))}"
                    class="progress-bar-any-colors-item"
                    role="progressbar"
                    style="${c({width:`${a.currentValue}%`,backgroundColor:a.bgColor})}"
                    aria-valuemin="0"
                    aria-valuemax="${this.maxValue}"
                    aria-valuenow="${b(a.currentValue)}"
                  >
                  </span>
                `))}
          `:m}
    `}get _amount(){return this.amount?s` <bbva-type-amount
          variant="l"
          .localCurrency="${this.localCurrency}"
          .amount="${this.amount}"
          .currencyCode="${this.currencyCode}"
          .language="${this.language}"
        >
        </bbva-type-amount>`:""}static _textHeader({type:a,ellipsis:t,tag:r,text:e}){return s`
      <bbva-type-text
        unset
        ?ellipsis="${t}"
        class="header-text ${a}"
        .tag="${r}"
        size="S"
        .text="${e}"
      >
      </bbva-type-text>
    `}get _heading(){return this.label?s` <div class="header-title">
          ${s`
            ${D._textHeader({type:d({"title-medium":this.titleMedium}),ellipsis:!0,tag:this.headingLevel,text:this.t(this.label)})}
          `}
        </div>`:""}get _mark(){return s`
      <span class="mark" style="${c({left:`calc(${this.markValue} * 1%)`})}"></span>
      <span
        class="mark middle"
        style="${c({left:`calc((${this.markValue} * 1%) + 2px`})}"
      ></span>
      <span
        class="mark"
        style="${c({left:`calc((${this.markValue} * 1%) + 5px`})}"
      ></span>
    `}get _dataVisualizationBar(){return s`
      ${this.barAnyColors?s`
            <span
              role="progressbar"
              class="progress-bar-any-colors"
              aria-label="${b(this.t(this.accessibilityText))}"
            >
              ${this._barAnyColors}
            </span>
          `:s`
            <span
              class="progress-bar"
              role="progressbar"
              aria-valuemin="0"
              aria-valuemax="${this.maxValue}"
              aria-valuenow="${b(Math.floor(this.currentValue))}"
              aria-label="${b(this.accessibilityText)}"
            >
              <span
                class="progress-bar-fill"
                aria-hidden="true"
                style="${c({transform:`translateX(calc((100 - ${this._calcPercentage}) * -1%)) translateZ(0.01px)`,backgroundColor:null==this?void 0:this.fillColor})}"
              >
              </span>
            </span>
          `}
      ${this.markValue?this._mark:""} ${this.constructor._shadow}
    `}updated(a){super.updated(a),a.has("progressBgColor")&&this.style.setProperty("--bbva-data-visualization-bar-bg-color",`${this.progressBgColor}`)}render(){return this.loading?s``:s`
          <div class="header">${this._heading}${this._amount}</div>
          <div class="data-wrapper">${this._dataVisualizationBar}</div>
        `}}export{D as B,V as b};
