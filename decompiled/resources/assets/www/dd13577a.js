import{z as a,a8 as t,aa as e,an as r,L as i,ak as o,h as n,bP as c,bQ as l,bR as s,i as b}from"./952f98a9.js";import{R as m,S as d,u as p,a5 as u,D as h,T as g,z as v,v as f,w as y,x as k,G as _,a6 as x,H as $}from"./216055dc.js";const S=a`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-rating--_ambient--focus-border-color: initial;
    --bbva-form-rating--_ambient--icon-color: initial;
    --bbva-form-rating--_ambient--checked-icon-color: initial;
    --bbva-form-rating--_ambient--all-checked-icon-color: initial;
    --bbva-form-rating--_ambient--thumb-icon-color: initial;
    --bbva-form-rating--_ambient--thumb-border-icon-color: initial;
    --bbva-form-rating--_ambient--thumb-checked-icon-color: initial;
  }
`,T=a`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-rating--_ambient--focus-border-color: var(
      --bbva-form-rating--custom--primary-alt-ambient--focus-border-color,
      ${m("colorPrimaryAltSurfaceAmbientFocus",d)}
    );

    --bbva-form-rating--_ambient--icon-color: var(
      --bbva-form-rating--custom--primary-alt-ambient--icon-color,
      ${m("colorPrimaryAltRatingStars",d)}
    );

    --bbva-form-rating--_ambient--checked-icon-color: var(
      --bbva-form-rating--custom--primary-alt-ambient--checked-icon-color,
      ${m("colorPrimaryAltRatingStars",d)}
    );

    --bbva-form-rating--_ambient--all-checked-icon-color: var(
      --bbva-form-rating--custom--primary-alt-ambient--all-checked-icon-color,
      transparent
    );

    --bbva-form-rating--_ambient--thumb-icon-color: var(
      --bbva-form-rating--custom--primary-alt-ambient--thumb-icon-color,
      transparent
    );

    --bbva-form-rating--_ambient--thumb-border-icon-color: var(
      --bbva-form-rating--custom--primary-alt-ambient--thumb-border-icon-color,
      ${m("colorPrimaryAltText01Default",d)}
    );

    --bbva-form-rating--_ambient--thumb-checked-icon-color: var(
      --bbva-form-rating--custom--primary-alt-ambient--thumb-checked-icon-color,
      ${m("colorPrimaryAltSelectionInteraction02Selected",d)}
    );
  }
`,w=a`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-rating--_ambient--focus-border-color: var(
      --bbva-form-rating--custom--secondary-ambient--focus-border-color,
      ${m("colorSecondarySurfaceAmbientFocus",d)}
    );

    --bbva-form-rating--_ambient--icon-color: var(
      --bbva-form-rating--custom--secondary-ambient--icon-color,
      ${m("colorSecondaryRatingStars",d)}
    );

    --bbva-form-rating--_ambient--checked-icon-color: var(
      --bbva-form-rating--custom--secondary-ambient--checked-icon-color,
      ${m("colorSecondaryRatingStars",d)}
    );

    --bbva-form-rating--_ambient--all-checked-icon-color: var(
      --bbva-form-rating--custom--secondary-ambient--all-checked-icon-color,
      transparent
    );

    --bbva-form-rating--_ambient--thumb-icon-color: var(
      --bbva-form-rating--custom--secondary-ambient--thumb-icon-color,
      transparent
    );

    --bbva-form-rating--_ambient--thumb-border-icon-color: var(
      --bbva-form-rating--custom--secondary-ambient--thumb-border-icon-color,
      ${m("colorSecondaryText01Default",d)}
    );

    --bbva-form-rating--_ambient--thumb-checked-icon-color: var(
      --bbva-form-rating--custom--secondary-ambient--thumb-checked--icon-color,
      ${m("colorSecondarySelectionInteraction02Selected",d)}
    );
  }
`,A=a`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-rating--_ambient--focus-border-color: var(
      --bbva-form-rating--custom--secondary-alt-ambient--focus-border-color,
      ${m("colorSecondaryAltSurfaceAmbientFocus",d)}
    );

    --bbva-form-rating--_ambient--icon-color: var(
      --bbva-form-rating--custom--secondary-alt-ambient--icon-color,
      ${m("colorSecondaryAltRatingStars",d)}
    );

    --bbva-form-rating--_ambient--checked-icon-color: var(
      --bbva-form-rating--custom--secondary-alt-ambient--checked-icon-color,
      ${m("colorSecondaryAltRatingStars",d)}
    );

    --bbva-form-rating--_ambient--all-checked-icon-color: var(
      --bbva-form-rating--custom--secondary-alt-ambient--all-checked-icon-color,
      transparent
    );

    --bbva-form-rating--_ambient--thumb-icon-color: var(
      --bbva-form-rating--custom--secondary-alt-ambient--thumb-icon-color,
      transparent
    );

    --bbva-form-rating--_ambient--thumb-border-icon-color: var(
      --bbva-form-rating--custom--secondary-alt-ambient--thumb-border-icon-color,
      ${m("colorSecondaryAltText01Default",d)}
    );

    --bbva-form-rating--_ambient--thumb-checked-icon-color: var(
      --bbva-form-rating--custom--secondary-alt-ambient--thumb-checked-icon-color,
      ${m("colorSecondaryAltSelectionInteraction02Selected",d)}
    );
  }
`;const I=p([Object.freeze({__proto__:null,primary:S,primaryAlt:T,secondary:w,secondaryAlt:A}),u,h,g,v]),q=Object.values(I);var L=a`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

:host {
  display: block;
  box-sizing: border-box;
  text-align: center;
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

.form-rating[aria-disabled=true] {
  pointer-events: none;
}

.title {
  margin: 0 0 1rem 0;
}

.inline-title {
  display: inherit;
}

.text {
  margin: 1rem auto 0 auto;
}

[data-tag-name=bbva-type-link] {
  width: fit-content;
  opacity: 100%;
}

.content {
  display: flex;
  justify-content: center;
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

.label-star .icon {
  fill: var(--_form-rating--icon-color);
  pointer-events: none;
  stroke: var(--_form-rating--icon-color);
  stroke-linecap: butt;
  stroke-width: 1.25rem;
  transition: color 0.2s ease-in-out;
}
.label-star:first-of-type {
  display: none;
  overflow: hidden;
  width: 0;
  height: 0;
}
.label-star:focus {
  outline: 0.125rem solid var(--_form-rating-focus-border-color);
  outline-offset: 0.75rem;
}

#thumb-container {
  column-gap: 4.5rem;
}

.thumb-item .icon {
  fill: var(--_form-rating--thumb-icon-color);
  stroke: var(--_form-rating--thumb-border-icon-color);
  stroke-linecap: butt;
  stroke-width: 1.25rem;
  transition: color 0.2s ease-in-out;
}
.thumb-item input[type=radio]:checked ~ .icon {
  fill: var(--_form-rating--thumb-checked-icon-color);
  stroke: var(--_form-rating--thumb-icon-color);
}
.thumb-item:focus {
  outline: 0.125rem solid var(--_form-rating-focus-border-color);
  outline-offset: 0.75rem;
}

.star-content {
  column-gap: 1.5rem;
}
.star-content input[type=radio] {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}
.star-content input[type=radio]:checked ~ .label-star .icon {
  fill: var(--_form-rating--all-checked-icon-color);
}
.star-content input[type=radio]:checked + .label-star .icon {
  fill: var(--_form-rating--checked-icon-color);
  pointer-events: none;
}

.inline {
  display: grid;
  column-gap: 1rem;
  grid-template-columns: 1fr auto;
  row-gap: 0.5rem;
}
.inline #thumb-container {
  column-gap: 1.5rem;
}

:host([loading]) {
  overflow: hidden;
  width: 100%;
  height: 7.5rem;
  background-color: var(--_skeleton-default-bg-color);
  mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(black 100%, transparent 0), linear-gradient(black 100%, transparent 0), linear-gradient(black 100%, transparent 0), linear-gradient(black 100%, transparent 0), linear-gradient(black 100%, transparent 0), linear-gradient(-60deg, transparent 50%, black 50%);
  mask-position: calc(50% + 108px) 20px, calc(50% - (calc(24px + calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(e.spacer)}))) / 16) * 1rem)) *2)) calc(42px + calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(e.spacer)}))) / 16) * 1rem)), calc(50% - calc(24px + calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(e.spacer)}))) / 16) * 1rem))) calc(42px + calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(e.spacer)}))) / 16) * 1rem)), calc(50%) calc(42px + calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(e.spacer)}))) / 16) * 1rem)), calc(50% + calc(24px + calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(e.spacer)}))) / 16) * 1rem))) calc(42px + calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(e.spacer)}))) / 16) * 1rem)), calc(50% + (calc(24px + calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(e.spacer)}))) / 16) * 1rem))* 2)) calc(42px + calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(e.spacer)}))) / 16) * 1rem)), calc(50% + 72px) calc(68px + (calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(e.spacer)}))) / 16) * 1rem) * 2));
  mask-repeat: no-repeat;
  mask-size: calc((216px * 2) + (var(--typographyTypeSmall, 0.9375rem)/ 2)) var(--typographyTypeSmall, 0.9375rem), 24px 24px, 24px 24px, 24px 24px, 24px 24px, 24px 24px, calc((144px * 2) + (var(--typographyTypeSmall, 0.9375rem)/ 2)) var(--typographyTypeSmall, 0.9375rem);
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

:host([loading][thumbs]) {
  height: 2.75rem;
  background-color: var(--_skeleton-default-bg-color);
  mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(black 100%, transparent 0), linear-gradient(black 100%, transparent 0);
  mask-position: 20px 20px, calc(100% - 52px) 20px, calc(100% - 20px) 20px;
  mask-repeat: no-repeat;
  mask-size: calc((44% * 2) + (16px/ 2)) 16px, 16px 16px, 16px 16px;
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
:host([loading][thumbs])::after {
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
`,z=a`
:host {
  --_form-rating-focus-border-color: var(--bbva-form-rating--_ambient--focus-border-color,
  var(--bbva-form-rating--custom--primary-ambient--focus-border-color,
    ${m("colorPrimarySurfaceAmbientFocus",d)}));
  --_form-rating--icon-color: var(--bbva-form-rating--_ambient--icon-color,var(--bbva-form-rating--custom--primary-ambient--icon-color,${m("colorPrimaryRatingStars",d)}));
  --_form-rating--checked-icon-color: var(--bbva-form-rating--_ambient--checked-icon-color, var(--bbva-form-rating--custom--primary-ambient--checked-icon-color, ${m("colorPrimaryRatingStars",d)}));
  --_form-rating--all-checked-icon-color: var(--bbva-form-rating--_ambient--all-checked-icon-color,var(--bbva-form-rating--custom--primary-ambient--all-checked-icon-color,transparent));
  --_form-rating--thumb-icon-color: var(--bbva-form-rating--_ambient--thumb-icon-color,var(--bbva-form-rating--custom--primary-ambient--thumb-icon-color, transparent));
  --_form-rating--thumb-border-icon-color: var(--bbva-form-rating--_ambient--thumb-border-icon-color,var(--bbva-form-rating--custom--primary-ambient--thumb-border-icon-color,${m("colorPrimaryText01Default",d)}));
  --_form-rating--thumb-checked-icon-color: var(--bbva-form-rating--_ambient--thumb-checked-icon-color,var(--bbva-form-rating--custom--primary-ambient--thumb-checked-icon-color,${m("colorPrimarySelectionInteraction02Selected",d)}));
}
`;class R extends(f(y(r(i)))){static get is(){return"bbva-form-rating"}static get scopedElements(){return{"bbva-type-icon":k,"bbva-type-text":_,"bbva-badge-default":x,"bbva-type-link":$}}static get properties(){return{accessibilityText:{type:String,attribute:"accessibility-text"},numStars:{type:Number,attribute:"num-stars"},contentTitle:{type:String,attribute:"content-title"},text:{type:String},statusType:{type:String,attribute:"status-type"},value:{type:Number},thumbs:{type:Boolean},disabled:{type:Boolean},hideText:{type:Boolean,attribute:"hide-text"},loading:{type:Boolean,reflect:!0},inline:{type:Boolean},hasNotEllipsis:{type:Boolean,attribute:"has-not-ellipsis"}}}constructor(){super(),this.accessibilityText="",this.numStars=5,this.contentTitle="",this.text="",this.value="",this._uniqueId=`radio-${String(Math.floor(Math.random()*Date.now()))}`,this._accessibilityLabel="bbva-form-rating-accessibility-label",this._accessibilityTextThumbsLike="bbva-form-rating-thumbs-like",this._accessibilityTextThumbsUnlike="bbva-form-rating-thumbs-unlike",this.thumbs=!1,this.disabled=!1,this.hideText=!1,this.loading=!1,this.statusType="default",this.inline=!1,this.hasNotEllipsis=!1}static get styles(){return[super.styles,L,z,q,o("bbva-form-rating-shared-styles")]}get _thumbsTemplate(){return n`
      <div id="thumb-container" class="content" role="radiogroup" @change="${this._ratingChanged}">
        <div
          class="thumb-item"
          tabindex="${this.disabled?-1:0}"
          @keydown="${this._keydownThumb}"
        >
          <span id="accessibleLabel-0" aria-hidden="true" class="sr-only">
            ${this.t(this._accessibilityTextThumbsLike)}
          </span>
          <label for="${this._uniqueId}-0">
            <input
              class="sr-only"
              type="radio"
              id="${this._uniqueId}-0"
              name="${this._uniqueId}"
              value="0"
              ?checked="${0===this.value}"
              aria-labelledby="accessibleLabel-0"
              tabindex="-1"
            />
            <bbva-type-icon
              class="icon"
              icon="${c()}"
              size="24"
              aria-hidden="true"
              data-test="icon-up"
            ></bbva-type-icon>
          </label>
        </div>

        <div
          class="thumb-item"
          tabindex="${this.disabled?-1:0}"
          @keydown="${this._keydownThumb}"
        >
          <span id="accessibleLabel-1" aria-hidden="true" class="sr-only">
            ${this.t(this._accessibilityTextThumbsUnlike)}
          </span>
          <label for="${this._uniqueId}-1">
            <input
              class="sr-only"
              type="radio"
              id="${this._uniqueId}-1"
              name="${this._uniqueId}"
              value="1"
              ?checked="${1===this.value}"
              aria-labelledby="accessibleLabel-1"
              tabindex="-1"
            />
            <bbva-type-icon
              class="icon"
              icon="${l()}"
              size="24"
              aria-hidden="true"
              data-test="icon-down"
            ></bbva-type-icon>
          </label>
        </div>
      </div>
    `}get _starsTemplate(){return n`
      <div
        id="star-container"
        class="content star-content"
        role="group"
        @change="${this._ratingChanged}"
        aria-labelledby="accessibleLabel-1 accessibleLabel-2 accessibleLabel-3 accessibleLabel-4 accessibleLabel-5"
      >
        <input
          type="radio"
          id="${this._uniqueId}-0"
          name="${this._uniqueId}"
          value="0"
          aria-hidden="true"
          tabindex="-1"
          checked
          hidden
        />
        <label class="label-star" hidden for="${this._uniqueId}-0"></label>

        ${this._stars.map(((a,t)=>n`
            <input
              type="radio"
              id="${this._uniqueId}-${t+1}"
              name="${this._uniqueId}"
              .value="${String(t+1)}"
              ?checked="${this.value===t+1}"
              aria-hidden="false"
            />

            <label
              class="label-star"
              for="${this._uniqueId}-${t+1}"
              tabindex="${this.disabled?-1:0}"
              @keydown=${this._keydownFavorite}
            >
              <span id="accessibleLabel-${t+1}" class="sr-only">
                ${this.t(this._accessibilityLabel,{index:t+1})}
              </span>

              <bbva-type-icon
                class="icon"
                .icon="${s()}"
                size="24"
                aria-hidden="true"
                data-test="icon"
              ></bbva-type-icon>
            </label>
          `))}
      </div>
    `}get _inlineTemplate(){return n`<bbva-type-text
        id="title"
        unset
        class="inline-title"
        ?ellipsis="${!this.hasNotEllipsis}"
        lines="1"
        size="S"
        text=${b(this.contentTitle)}
      ></bbva-type-text>
      ${this._thumbsTemplate}
      ${this.text?n`<bbva-type-link
            id="text"
            unset
            text=${this.text}
            type=${this.statusType}
            @click="${this._linkClick}"
            ?disabled="${this.disabled}"
          ></bbva-type-link>`:""}`}get _labelTemplate(){return this.contentTitle?n`<bbva-type-text
          id="title"
          unset
          ?ellipsis="${!this.hasNotEllipsis}"
          lines="1"
          alignment="center"
          class="title"
          size="S"
          text=${b(this.contentTitle)}
        ></bbva-type-text>`:""}get _statusTemplate(){return this.text&&!this.hideText?n`<bbva-badge-default
          id="text"
          unset
          class="text"
          text=${this.text}
          type=${this.statusType}
        ></bbva-badge-default>`:""}render(){return n`${this.loading?n``:n`<div class="form-rating ${this.inline?"inline":""}" aria-disabled=${this.disabled}>
          <span id="accessible-text" class="sr-only">${this.accessibilityText}</span>
          ${this.inline?this._inlineTemplate:n`
                ${this._labelTemplate} ${this.thumbs?this._thumbsTemplate:this._starsTemplate}
                ${this._statusTemplate}
              `}
        </div> `}`}get _stars(){return Array(this.numStars).fill(void 0)}_keydownThumb(a){13===a.keyCode&&(a.currentTarget.querySelector("input").checked=!0,this._ratingChanged())}_keydownFavorite(a){if(13===a.keyCode){const t=`#${a.currentTarget.htmlFor}`;this.shadowRoot.querySelector(t).checked=!0,this._ratingChanged()}}_ratingChanged(){this.value=Number(this.shadowRoot.querySelector(":checked").value),this.dispatchEvent(new CustomEvent("form-rating-value-change",{detail:this.value,bubbles:!0,composed:!0}))}_linkClick(){this.dispatchEvent(new CustomEvent("form-rating-link-click",{detail:!0,bubbles:!0,composed:!0}))}}export{R as B,I as b};
